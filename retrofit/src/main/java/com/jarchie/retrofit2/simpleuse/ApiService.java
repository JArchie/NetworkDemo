package com.jarchie.retrofit2.simpleuse;

import com.jarchie.retrofit2.bean.Movie;
import com.jarchie.retrofit2.bean.UserLogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Jarchie on 2017\12\1.
 * 这里是未封装的，简单使用它的api
 */

public interface ApiService {

    //获取猫眼首页数据
    @GET("movie/list.json?type=hot")
    Call<Movie> getList(@Query("offset") int offset, @Query("limit") int limit);

    @POST("authz/login")
    Call<UserLogin> login(@Query("userName") String userName, @Query("userPsw") String userPsw);

}
