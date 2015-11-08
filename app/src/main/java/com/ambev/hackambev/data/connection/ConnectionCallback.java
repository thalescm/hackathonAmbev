package com.ambev.hackambev.data.connection;

import java.io.Serializable;

/**
 * Created by thalesmachado on 11/8/15.
 */
public interface ConnectionCallback<T extends Serializable> {

    void onSuccess (T response);
    void onFailure (String message);
}
