package com.risda.washl.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {



    public static final String BASE_URL = ServerConfig.API_ENDPOINT;
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiInterface getService(){
        ApiInterface apiInterface = getClient().create(ApiInterface.class);

        return apiInterface;
    }
}
