package com.ambev.hackambev.data.connection;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by thalesmachado on 11/7/15.
 */
public class Connector {

    public static final String BASE_URL = "http://dce1b147.ngrok.io";

    static API apiService;

    public static void initialize() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService =
                retrofit.create(API.class);
    }

    public static API getConnector() {
        return apiService;
    }
}
