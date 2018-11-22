package com.hfad.retrofitpostrequest;

import android.app.Application;

import com.hfad.retrofitpostrequest.constants.AppConstants;
import com.hfad.retrofitpostrequest.webservice.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppApplication extends Application {
    public static AppApplication appApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        appApplication = this;
    }


    public ApiService getNetworkService() {
        return initRetrofit(AppConstants.BASE_URL)
                .create(ApiService.class);
    }


    private Retrofit initRetrofit(String baseUrl) {
        return
                new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
    }


}
