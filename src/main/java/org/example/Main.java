package org.example;


import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();

        person.put("name:", "John");
        person.put("LastName:", "Smith");

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);

    }
}
