package com.ambev.hackambev.data.models;

import com.ambev.hackambev.data.cache.Cache;
import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by thalesmachado on 11/7/15.
 */
public class User implements Serializable {

    public String name;
    public int id;
    public String  email;
    public String password;


    public static User getDefault() {
        String stringfiedMe = Cache.getString(User.class.getName());
        if (stringfiedMe != null) {
            return new Gson().fromJson(stringfiedMe, User.class);
        }
        return null;
    }

    public void save() {
        Cache.putString(User.class.getName(), new Gson().toJson(this).toString());
    }
}
