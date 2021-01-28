package com.quwi.foo.data.remote;

import com.quwi.foo.model.LoginResponseEntity;
import com.quwi.foo.model.ProjectListResponse;
import com.quwi.foo.util.Constants;

import java.util.HashMap;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {

    @GET(Constants.GET_PROJECTS)
    Single<ProjectListResponse> getProjects(@Header("Authorization") String token);

    @POST(Constants.LOGIN)
    Single<LoginResponseEntity> login(@Body HashMap<String, String> bodyParamMap);

    @POST(Constants.RENAME_PROJECT)
    Single<ProjectListResponse> renameProject(@Header("Authorization") String token, @Query("id") long id, @Body HashMap<String, String> bodyParamMap);
}
