package com.ambev.hackambev.data.providers;

import com.ambev.hackambev.data.connection.ConnectionCallback;
import com.ambev.hackambev.data.models.User;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by thalesmachado on 11/8/15.
 *
 */
public class UserProvider extends BaseProvider {

    public void getUser(final ConnectionCallback<User> callback) {

        getConnector().getUser().enqueue(new Callback<User>() {
            @Override
            public void onResponse (Response<User> response, Retrofit retrofit) {

                try {
                    checkResponse(response);
                    callback.onSuccess(response.body());
                } catch (ConnectionError connectionError) {
                    callback.onFailure(connectionError.getMessage());
                }
            }

            @Override
            public void onFailure (Throwable t) {
                callback.onFailure(BaseProvider.ConnectionError.getDefaultErrorMessage());
            }
        });
    }

    public void createUser(String email, String password, final ConnectionCallback<User> callback) {

        User user = new User();
        user.email = email;
        user.password = password;
        getConnector().createUser(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse (Response<User> response, Retrofit retrofit) {
                
                try {
                    checkResponse(response);
                    callback.onSuccess(response.body());
                } catch (ConnectionError connectionError) {
                    callback.onFailure(connectionError.getMessage());
                }
            }

            @Override
            public void onFailure (Throwable t) {
                callback.onFailure(BaseProvider.ConnectionError.getDefaultErrorMessage());
            }
        });
    }
}
