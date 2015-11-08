package com.ambev.hackambev.data.models;

import com.ambev.hackambev.data.cache.Cache;
import com.google.gson.Gson;

import java.io.Serializable;

public class Bar implements Serializable {

    private String mName;
    private int mID;
    private int mResID;

    public Bar(String name, int id, int resID) {
        mName = name;
        mID = id;
        mResID = resID;
    }

    public static Bar getDefault() {
        String stringfiedMe = Cache.getString(Bar.class.getName());
        if (stringfiedMe != null) {
            return new Gson().fromJson(stringfiedMe, Bar.class);
        }
        return null;
    }

    public void save() {
        Cache.putString(User.class.getName(), new Gson().toJson(this).toString());
    }
}