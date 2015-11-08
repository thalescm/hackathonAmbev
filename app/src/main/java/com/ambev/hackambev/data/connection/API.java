package com.ambev.hackambev.data.connection;

import com.ambev.hackambev.data.models.Bar;
import com.ambev.hackambev.data.models.User;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by thalesmachado on 11/7/15.
 */
public interface API {

    @GET("/posts/1")
    Call<User> getUser();

    @POST("/users")
    Call<User> createUser(@Body User user);

    @GET("/posts/1")
    Call<Bar> getBar();
}
