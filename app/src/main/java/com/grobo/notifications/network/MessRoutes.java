package com.grobo.notifications.network;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface MessRoutes {

    //mess
    @GET("/mess/{studentMongoId}")
    Call<ResponseBody> getMessData(@Path("studentMongoId") String studentMongoId);
    @PATCH("/mess/cancel/{studentMongoId}")
    Call<ResponseBody> cancelMeal(@Path("studentMongoId") String studentMongoId, @Body RequestBody body);

}
