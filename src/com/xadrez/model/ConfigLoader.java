package com.xadrez.model;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigLoader {
    public static JSONObject carregarConfiguracao() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("resources/config.json")));
            return new JSONObject(content);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
