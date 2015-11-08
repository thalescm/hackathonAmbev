package com.ambev.hackambev;

import android.app.Application;

import com.ambev.hackambev.data.cache.Cache;
import com.ambev.hackambev.data.connection.Connector;

/**
 * Created by thalesmachado on 11/8/15.
 */
public class MyApp extends Application {

    @Override
    public void onCreate () {
        super.onCreate();
        Connector.initialize();
        Cache.initialize(this);
    }
}
