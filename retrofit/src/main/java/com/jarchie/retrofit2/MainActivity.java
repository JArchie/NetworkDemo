package com.jarchie.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jarchie.retrofit2.bean.Movie;
import com.jarchie.retrofit2.bean.UserLogin;
import com.jarchie.retrofit2.simpleuse.RetrofitFactory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btnGet = (TextView) findViewById(R.id.btn_get);
        TextView btnPost = (TextView) findViewById(R.id.btn_post);
        tvText = (TextView) findViewById(R.id.tv_text);
        btnGet.setOnClickListener(this);
        btnPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_get:
                RetrofitFactory.getInstance().getService().getList(0,10).enqueue(new Callback<Movie>() {
                    @Override
                    public void onResponse(Call<Movie> call, Response<Movie> response) {
                        tvText.setText(response.body().getData().getMovies().get(1).getNm());
                    }

                    @Override
                    public void onFailure(Call<Movie> call, Throwable t) {

                    }
                });
                break;
            case R.id.btn_post:
                RetrofitFactory.getInstance().getService().login("gwc1234","666666").enqueue(new Callback<UserLogin>() {
                    @Override
                    public void onResponse(Call<UserLogin> call, Response<UserLogin> response) {
                        tvText.setText(response.body().getInfo().getUserDisplayName());
                    }

                    @Override
                    public void onFailure(Call<UserLogin> call, Throwable t) {

                    }
                });
                break;
        }
    }
}
