package com.example.linhnb.androidcore.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String listObjString(List<Object> objects) {
        return new Gson().toJson(objects);
    }

    public static List<Object> getAllObj(String objectString) {
        Type listType = new TypeToken<ArrayList<Object>>() {
        }.getType();
        return new Gson().fromJson(objectString, listType);
    }
}
