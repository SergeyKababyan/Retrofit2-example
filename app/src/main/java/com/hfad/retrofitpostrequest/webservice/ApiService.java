package com.hfad.retrofitpostrequest.webservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
   @POST("user")
    Call<MyResponseModel> register(@Body MyPostData myPostData);
}
