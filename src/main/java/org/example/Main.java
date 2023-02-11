package org.example;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println(Lib.getGreeting());
        }
        else {
            if(args[0].equalsIgnoreCase("example")){
                HttpLib httpLib = new HttpLib();
                System.out.println(httpLib.getExampleDotCom());
            }
            if(args[0].equalsIgnoreCase("photo")){
                var api = JSONPlaceholderAPI.getInstance();
                api.getPhotos().execute().body().forEach(ph->{
                    System.out.println(ph.getId());
                });
            }

            if(args[0].equalsIgnoreCase("post")){
                var api = JSONPlaceholderAPI.getInstance();
                api.getPosts().execute().body().forEach(post->{
                    System.out.println(post.getTitle());
                });
            }

            if(args[0].equalsIgnoreCase("comment")){
                var api = JSONPlaceholderAPI.getInstance();
                api.getComments().execute().body().forEach(comment ->{
                    System.out.println(comment.getEmail());
                });
            }
        }


    }
}