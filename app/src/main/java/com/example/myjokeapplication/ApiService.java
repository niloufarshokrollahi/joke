package com.example.myjokeapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("random_joke")
    Call<ModelJoke> fetchJoke();
}
