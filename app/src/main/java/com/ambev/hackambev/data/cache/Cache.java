package com.ambev.hackambev.data.cache;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by thalesmachado on 11/8/15.
 */
public class Cache {

    private static SharedPreferences sharedPref;

    public static void initialize (Context context) {
        sharedPref =  context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
    }

    public static String getString(String name) {
        return getString(name,null);
    }

    public static String getString(String name, String defaultValue) {
        return sharedPref.getString(name, defaultValue);
    }

    public static void putString(String name, String value) {
        sharedPref.edit().putString(name, value).commit();
    }

}
