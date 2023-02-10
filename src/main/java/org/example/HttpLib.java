package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class HttpLib {
    OkHttpClient client;
    public HttpLib(){
        client = new OkHttpClient();
    }

    String getExampleDotCom(){
        Request request = new Request.Builder()
                .url("https://example.com")
                .build();
        try (var response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
