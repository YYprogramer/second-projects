package com.iwatsuki;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> prefectureCapitals = new HashMap<>();
        prefectureCapitals.put("北海道", "札幌");
        prefectureCapitals.put("青森県", "青森");
        prefectureCapitals.put("岩手県", "盛岡");

        System.out.println(prefectureCapitals.get("岩手県"));

    }
}
