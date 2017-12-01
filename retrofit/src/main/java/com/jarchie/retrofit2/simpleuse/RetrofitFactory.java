package com.jarchie.retrofit2.simpleuse;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017\12\1 0001.
 */

public class RetrofitFactory {
//    private static final String BASE_URL = "http://m.maoyan.com/";
    private static final String BASE_URL = "http://10.136.2.149:9999/app-ljyyx/rest/app/";
    private Retrofit mRetrofit;
    private static RetrofitFactory mInstance;

    private RetrofitFactory() {
        //添加header
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder().addHeader("apikey", "abcdefghijk").build();
                return chain.proceed(newRequest);
            }
        }).build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static RetrofitFactory getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitFactory.class) {
                if (mInstance == null) {
                    mInstance = new RetrofitFactory();
                }
            }
        }
        return mInstance;
    }

    public ApiService getService(){
        return mRetrofit.create(ApiService.class);
    }

}
