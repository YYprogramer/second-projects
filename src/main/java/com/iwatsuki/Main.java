package com.iwatsuki;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> prefectureCapitals = new HashMap<>();
        prefectureCapitals.put("北海道", "札幌");
        prefectureCapitals.put("青森県", "青森");
        prefectureCapitals.put("岩手県", "盛岡");

        String hokkaidoCapital = prefectureCapitals.get("北海道");
        System.out.println("北海道の県庁所在地は" + hokkaidoCapital + "です");

        try {
            String prefecture = "東京";
            String capital = getCapital(prefecture, prefectureCapitals);
            System.out.println(prefecture + "の県庁所在地は" + capital);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static String getCapital(String prefecture, Map<String, String> map) throws NotFoundException {
        String capital = map.get(prefecture);

        if (capital == null) {
            throw new NotFoundException(prefecture + "の県庁所在地は見つかりません");
        }

        return capital;
    }

    static class NotFoundException extends Exception {
        public NotFoundException(String message) {
            super(message);
        }
    }
}
