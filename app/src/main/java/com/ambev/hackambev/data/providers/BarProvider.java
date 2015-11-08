package com.ambev.hackambev.data.providers;

import com.ambev.hackambev.data.connection.ConnectionCallback;
import com.ambev.hackambev.data.models.Bar;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by raphaelferras on 08/11/15.
 */
public class BarProvider extends BaseProvider {
    public void getBar(final ConnectionCallback<Bar> callback) {

        getConnector().getBar().enqueue(new Callback<Bar>() {
            @Override
            public void onResponse(Response<Bar> response, Retrofit retrofit) {

                try {
                    checkResponse(response);
                    callback.onSuccess(response.body());
                } catch (BaseProvider.ConnectionError connectionError) {
                    callback.onFailure(connectionError.getMessage());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                callback.onFailure(BaseProvider.ConnectionError.getDefaultErrorMessage());
            }
        });
    }
}
