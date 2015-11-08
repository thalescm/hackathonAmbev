package com.ambev.hackambev.data.connection;

import com.ambev.hackambev.data.models.User;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by thalesmachado on 11/7/15.
 */
public interface API {

    @GET("/posts/1")
    Call<User> getUser();


}
