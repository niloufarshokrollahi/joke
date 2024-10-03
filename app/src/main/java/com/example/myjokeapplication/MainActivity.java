package com.example.myjokeapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView nilou1 = findViewById(R.id.recylerview);
//        List<ModelJoke> nilou2 = new ArrayList<>();
//        nilou2.add(new ModelJoke(10, "jooooke", "bekhand"));
//        nilou2.add(new ModelJoke(5, "jooooke", "bekhand"));
//        nilou2.add(new ModelJoke(0, "jooooke", "bekhand"));
//        nilou2.add(new ModelJoke(1, "jooooke", "bekhand"));
        AdapterJoke jokeAdapter = new AdapterJoke();
        nilou1.setAdapter(jokeAdapter);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://official-joke-api.appspot.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        for (int i = 0; i <= 10; i++) {

            apiService.fetchJoke().enqueue(new Callback<ModelJoke>() {
                @Override
                public void onResponse(Call<ModelJoke> call, Response<ModelJoke> response) {
                    if (response.body() != null) {
                        jokeAdapter.addJoke(response.body());
                        nilou1.smoothScrollToPosition(0);

                    }

                }

                @Override
                public void onFailure(Call<ModelJoke> call, Throwable throwable) {

                }
            });
        }


    }
}