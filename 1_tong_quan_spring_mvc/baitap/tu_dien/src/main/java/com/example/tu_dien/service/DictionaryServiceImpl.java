package com.example.tu_dien.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImpl implements IDictionaryService {
    private static Map<String,String> map= new HashMap<>();
    static {
        map.put("dog","Con chó");
        map.put("bear","Con gấu");
        map.put("cat","Con heo");
        map.put("pig","Con heo");
        map.put("monkey","Con khỉ");
    }

    @Override
    public String change(String english) {
        if (map.containsKey(english.toLowerCase())){
            return map.get(english.toLowerCase());
        }else {
            return "Not find";
        }
    }
}
