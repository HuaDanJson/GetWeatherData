package cool.monkey.android.smartclothes.utils;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jason on 2018/1/19.
 */

public class GsonConverter {

    private final static Gson gson = new Gson();

    public static boolean isValidityJson(String json) {
        try {
            if (!TextUtils.isEmpty(json)) {
                new JsonParser().parse(json);
                return true;
            }
        } catch (JsonParseException e) {
            return false;
        }
        return false;
    }

    public static boolean isContainJSONArray(String json) {
        try {
            if (!TextUtils.isEmpty(json)) {
                Object jsonObject = new JSONTokener(json).nextValue();
                if (jsonObject != null && jsonObject instanceof JSONArray) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static <T> T fromJson(String json, Class<T> tClass) {
        return gson.fromJson(json, tClass);
    }

    public static <T> T fromJson(String json, Type type) {
        return gson.fromJson(json, type);
    }

    public static String toJson(Object o) {
        return gson.toJson(o);
    }

    public static <T> T fromObject(Object obj, Class<T> tClass) {
        String json = toJson(obj);
        return fromJson(json, tClass);
    }

    public static <T> List<T> jsonToList(String json, Class<? extends T[]> clazz) {

        Gson gson = new Gson();

        T[] array = gson.fromJson(json, clazz);

        return Arrays.asList(array);

    }
}
