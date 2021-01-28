package com.quwi.foo.data.remote.repo;

import com.quwi.foo.data.remote.APIService;
import com.quwi.foo.model.ProjectListResponse;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Single;

public class ProjectsRepo {

    private final APIService api;

    @Inject
    public ProjectsRepo(APIService api) {
        this.api = api;
    }

    public Single<ProjectListResponse> ProjectList(String token) {
        return api.getProjects("Bearer " + token);
    }

    public Single<ProjectListResponse> RenameProject(long id, String token, String name) {
        HashMap<String, String> body = new HashMap<>();
        body.put("name", name);
        return api.renameProject("Bearer " + token, id, body);
    }

}
