package com.annotation.custom_annotations.custom_serialization;

import java.lang.reflect.Field;

public class SerializeJson {

    public static String serialize(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{"); // Start JSON object

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                String fieldKey = jsonField.key();

                try {
                    field.setAccessible(true); // Allow access to private fields
                    Object value = field.get(obj);

                    if (!firstField) {
                        sb.append(",");
                    }

                    sb.append("\"").append(fieldKey).append("\":");
                    if (value instanceof String) {
                        sb.append("\"").append(value).append("\"");
                    } else {
                        sb.append(value);
                    }

                    firstField = false;
                } catch (Exception e) {
                    System.out.println("Error serializing field: " + field.getName() + " - " + e.getMessage());
                }
            }
        }

        sb.append("}"); // End JSON object
        return sb.toString();
    }

    public static void main(String[] args) {
        User user = new User("Rishav", "Developer");
        String jsonString = SerializeJson.serialize(user);
        System.out.println(jsonString); // Print the JSON result
    }
}
