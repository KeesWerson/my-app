package com.s61ba.util;

        import com.google.gson.GsonBuilder;
        import com.google.gson.JsonObject;
        import com.google.gson.JsonParser;

        import java.lang.reflect.Type;
        import java.util.List;

public class Json {

    private static JsonParser parser = new JsonParser();
    private static GsonBuilder builder = new GsonBuilder();

    public static String toJson(Object obj, boolean exclude) {
        if(exclude) {
            return builder.excludeFieldsWithoutExposeAnnotation().create().toJson(obj);
        }
        return builder.create().toJson(obj);
    }

    public static String toJson(List<Object> objList, boolean exclude) {
        if(exclude) {
            return builder.excludeFieldsWithoutExposeAnnotation().create().toJson(objList);
        }
        return builder.create().toJson(objList);
    }

    public static String fromJosn(String json, Type type) {
        return builder.create().fromJson(json, type);
    }

    public static JsonObject toJsonObject(String json) {
        return parser.parse(json).getAsJsonObject();
    }

    public static GsonBuilder getBuilder() {
        return builder;
    }
    public static JsonParser getParser() {
        return parser;
    }
}
