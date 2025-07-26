package org.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("name", "Ekaterina");
        data.put("lastName", "Makarichak");
        Gson gson = new Gson();
        System.out.println(gson.toJson(data));
    }
}