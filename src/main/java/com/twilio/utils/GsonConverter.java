package com.twilio.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Component
public class GsonConverter {

  public Map<String, Object> convertObjectToMap(Object t) {
    String responseJson = new Gson().toJson(t);
    Type type = new TypeToken<Map<String, Object>>() {}.getType();
    return new Gson().fromJson(responseJson, type);
  }

  public List<Object> convertObjectToList(Object t){
    String responseJson = new Gson().toJson(t);
    Type type = new TypeToken<List<Object>>() {}.getType();
    return new Gson().fromJson(responseJson,type);
  }
}
