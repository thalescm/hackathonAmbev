package com.ambev.hackambev.data.providers;

import android.util.Log;

import com.ambev.hackambev.data.connection.ConnectionCallback;
import com.ambev.hackambev.data.connection.Connector;
import com.ambev.hackambev.data.models.User;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by thalesmachado on 11/8/15.
 */
public class UserProvider {

    public void getUser(ConnectionCallback<User> callback) {

        Connector.getConnector().getUser().enqueue(new Callback<User>() {
            @Override
            public void onResponse (Response<User> response, Retrofit retrofit) {
                Log.d("CODE", String.valueOf(response.code()));
                Log.d("USER", response.body().body);
            }

            @Override
            public void onFailure (Throwable t) {
                Log.d("ERROR", "deu ruim");
            }
        });
    }
}
