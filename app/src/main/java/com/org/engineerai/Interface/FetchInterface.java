package com.org.engineerai.Interface;
import com.org.engineerai.POJO.Hits;
import com.org.engineerai.POJO.Mydata;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public  interface FetchInterface {

    @GET("search_by_date")
    abstract Call<List<Mydata>>searchByDate(@Query("tags") String query1,
                                          @Query("page") String query2);


}
