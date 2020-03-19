package com.org.engineerai.activities;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api_Connection {

    public static  String Baseurl="";
    public static Retrofit retrofit=null;

    public static  Retrofit getClient(Context context){

       Baseurl="https://hn.algolia.com/api/v1/";
       if(retrofit==null){
           retrofit=new Retrofit.Builder().baseUrl(Baseurl).addConverterFactory(GsonConverterFactory.create()).build();
       }
      return  retrofit;
    }
}
