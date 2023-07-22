package com.rakeshcs.imageviewpagersample.connection;

import com.rakeshcs.imageviewpagersample.model.ImageDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by gleecusdev on 06/09/16.
 */
public interface APIServices {

    @GET("/v1/assessments/2f23b7a7-44cf-46f7-b401-6da7331342f4/slides/")
    @Headers("Authorization: Basic 68f1fddf44d9f0c173b215c3ce:x")
    Call<List<ImageDetail>> getImageList();// dynamic url

}
