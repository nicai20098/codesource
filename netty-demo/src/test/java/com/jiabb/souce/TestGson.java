package com.jiabb.souce;

import com.jiabb.protocol.Serializer;
import com.google.gson.*;


public class TestGson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Class.class, new Serializer.ClassCodec()).create();
        System.out.println(gson.toJson(String.class));
    }
}
