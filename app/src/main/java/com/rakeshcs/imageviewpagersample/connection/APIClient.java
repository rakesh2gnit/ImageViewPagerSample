package com.rakeshcs.imageviewpagersample.connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gleecusdev on 01/09/16.
 */
public class APIClient {

    private static final String BASE_URL = "https://api.traitify.com";

    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static APIServices getApiService() {
        return getRetrofitInstance().create(APIServices.class);
    }
}
