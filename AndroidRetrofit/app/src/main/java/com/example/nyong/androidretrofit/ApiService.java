package com.example.nyong.androidretrofit;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    public static final String API_URL = "http://52.79.152.140:8080/apis/";

    @GET("Apply")
    Call<ResponseBody> getComment(@Query("status")String status);

}
