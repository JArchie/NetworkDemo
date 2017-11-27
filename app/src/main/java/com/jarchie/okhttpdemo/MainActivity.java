package com.jarchie.okhttpdemo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView btnGet, btnPost, btnPostFile, btnDwFile, btnPostMultiple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        btnGet.setOnClickListener(this);
        btnPost.setOnClickListener(this);
        btnPostFile.setOnClickListener(this);
        btnDwFile.setOnClickListener(this);
        btnPostMultiple.setOnClickListener(this);
    }

    private void initView() {
        btnGet = (TextView) findViewById(R.id.btn_get);
        btnPost = (TextView) findViewById(R.id.btn_post);
        btnPostFile = (TextView) findViewById(R.id.btn_postfile);
        btnDwFile = (TextView) findViewById(R.id.btn_downloadfile);
        btnPostMultiple = (TextView) findViewById(R.id.btn_postmultiple);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_get:
                getRequest();
                break;
            case R.id.btn_post:
                postRequest();
                break;
            case R.id.btn_postfile:
                uploadFile();
                break;
            case R.id.btn_downloadfile:
                downloadFile();
                break;
            case R.id.btn_postmultiple:
                uploadMultipartFile();
                break;
        }
    }

    //设置各个超时时间和缓存
    private void setTimeoutAndCache(){
        File fileCache = getExternalCacheDir();
        int cacheSize = 10 * 1024 * 1024; //缓存大小
        //这里只是简单的做个说明，实际项目中我们会采用单例模式进行构建
        //然后在里面进行各种属性的配置，最后返回我们的OkHttpClient对象
        OkHttpClient mClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS) //连接超时
                .writeTimeout(30,TimeUnit.SECONDS) //写超时
                .readTimeout(30,TimeUnit.SECONDS) //读超时
                .cache(new Cache(fileCache.getAbsoluteFile(),cacheSize)) //缓存路径
                .build();
    }

    //表单形式上传，含文件和其它参数
    private void uploadMultipartFile() {
        OkHttpClient mClient = new OkHttpClient();
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("uid", "110") //用户uid，添加这个参数作为一个例子说明
                .addFormDataPart("image", "test.png",
                        RequestBody.create(Constant.MEDIA_TYPE_IMAGE, new File("/sdcard/test.png")))
                .build();
        Request request = new Request.Builder()
                .url(Constant.URL_MULTIPART)
                .post(requestBody)
                .build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("MULTIPART----", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                final String str = response.body().string();
                Log.e("Response", "onResponse: " + str);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    //下载文件
    private void downloadFile() {
        OkHttpClient mClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Constant.URL_IMAGE)
                .build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("DOWNLOAD----", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                InputStream inputStream = response.body().byteStream();
                FileOutputStream fileOutputStream;
                try {
                    fileOutputStream = new FileOutputStream(new File("/sdcard/download.jpg"));
                    byte[] buffer = new byte[2048];
                    int len;
                    while ((len = inputStream.read(buffer)) != -1) {
                        fileOutputStream.write(buffer, 0, len);
                    }
                    fileOutputStream.flush();
                } catch (IOException e) {
                    Log.i("Download----", e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }

    //上传单一文件类型
    private void uploadFile() {
        OkHttpClient mClient = new OkHttpClient();
        File file = new File("/sdcard/test.png");
        /**
         属性：
         text/x-markdown ：MARKDOWN文本格式
         text/html ： HTML格式
         text/plain ：纯文本格式
         text/xml ：  XML格式
         image/gif ：gif图片格式
         image/jpeg ：jpg图片格式
         image/png：png图片格式
         以application开头的媒体格式类型：

         application/xhtml+xml ：XHTML格式
         application/xml     ： XML数据格式
         application/atom+xml  ：Atom XML聚合格式
         application/json    ： JSON数据格式
         application/pdf       ：pdf格式
         application/msword  ： Word文档格式
         application/octet-stream ： 二进制流数据（如常见的文件下载）
         application/x-www-form-urlencoded ： <form encType=””>中默认的encType，form表单数据被编码为key/value格式发送到服务器（表单默认的提交数据的格式）

         另外一种常见的媒体格式是上传文件之时使用的：
         multipart/form-data ： 需要在表单中进行文件上传时，就需要使用该格式
         注意：MediaType.parse("image/png")里的"image/png"不知道该填什么，可以参考---》http://www.w3school.com.cn/media/media_mimeref.asp
         如何使用呢？(在请求体里面写入类型和需要写入的数据，通过post请求)
         String body = "hdsoifhjoihdsfh";
         RequestBody body = RequestBody.create(MEDIA_TYPE_MARKDOWN, body);
         */
        Request request = new Request.Builder()
                .url(Constant.URL_POST_FILE) //上传文件的服务器地址
                .post(RequestBody.create(Constant.MEDIA_TYPE_IMAGE, file)) //指定RequestBody的数据格式,这里指定为图片格式
                .build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("POSTFILE----", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                final String str = response.body().string();
                Log.e("Response", "onResponse: " + str);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    //Post请求
    private void postRequest() {
        OkHttpClient mClient = new OkHttpClient();
        //构建RequestBody对象，这里需要注意的是：无论什么类型的Post请求，
        // 只是RequestBody的获取方式不一样，其它的操作都是一样的
        RequestBody requestBody = new FormBody.Builder()
                .add("key1", "value1") //以键值对的方式提交参数
                .add("key2", "value2")
                .build();
        Request request = new Request.Builder()
                .url(Constant.URL_POST) //这里是随便写的一个地址，正式使用需要公司后台人员给出
                .post(requestBody)
                .build();
        Call call = mClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("POST----", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                final String str = response.body().string();
                Log.e("Response", "onResponse: " + str);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    //Get请求
    private void getRequest() {
        //1.实例化okhttpclient对象
        OkHttpClient mClient = new OkHttpClient();
        //2.创建Request对象
        Request request = new Request.Builder().url(Constant.URL_GET).build();
        //3.通过client对象构建Call对象,将request作为参数传入构造方法中
        Call call = mClient.newCall(request);
        //4.通过call对象执行异步操作，在回调方法中处理Response结果
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e("GET----", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                final String str = response.body().string();
                Log.e("Response", "onResponse: " + str);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

}
