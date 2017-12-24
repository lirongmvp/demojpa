package com.example.demojpa.jsonTest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lirong
 * @create 2017/12/24
 * @since 1.0.0
 */
public class JsonTest {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"name\": \"张三\",\n" +
                "    \"age\": 15,\n" +
                "    \"list\": [\n" +
                "        {\n" +
                "            \"name\": \"李四\",\n" +
                "            \"age\": 16\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"王五\",\n" +
                "            \"age\": 17\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        JSONObject jsonObject = JSONObject.parseObject(json);
        String name = jsonObject.getString("name");
        String age = jsonObject.getString("age");
        System.out.printf("name:" + name + "age:" + age);
        JSONArray jsonArray = jsonObject.getJSONArray("list");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject list = jsonArray.getJSONObject(i);
            String  nameList = list.getString("name");
            String ageList = list.getString("age");
            System.out.printf("nameList:" + nameList + "ageList:" + ageList);
        }
    }
}
