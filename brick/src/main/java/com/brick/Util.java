package com.brick;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.InputStream;

/**
 * @author Michael Wijaya
 * @version Util.java, v0.1 Nov 24, 2021 10:30 AM Michael Wijaya Exp $
 */
@UtilityClass
public class Util {
    private static final ObjectMapper OBJECT_MAPPER =
            Jackson2ObjectMapperBuilder.json().failOnEmptyBeans(false).build();

    @SneakyThrows
    public static String serialize(Object obj) {
        return OBJECT_MAPPER.writeValueAsString(obj);
    }

    @SneakyThrows
    public static <T> T deserialize(String s, Class<T> clazz) {
        return OBJECT_MAPPER.readValue(s, clazz);
    }

    @SneakyThrows
    public static <T> T deserialize(String s, TypeReference<T> typeReference) {
        return OBJECT_MAPPER.readValue(s, typeReference);
    }

    @SneakyThrows
    public static <T> T deserialize(InputStream inputStream, Class<T> clazz) {
        return OBJECT_MAPPER.readValue(inputStream, clazz);
    }

    public static <T> T deserialize(Object o, TypeReference<T> typeReference) {
        return OBJECT_MAPPER.convertValue(o, typeReference);
    }
}
