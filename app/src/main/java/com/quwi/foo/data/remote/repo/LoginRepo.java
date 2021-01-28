package com.quwi.foo.data.remote.repo;

import com.quwi.foo.data.remote.APIService;
import com.quwi.foo.model.LoginResponseEntity;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Single;

public class LoginRepo {

    private final APIService api;

    @Inject
    public LoginRepo(APIService api) {
        this.api = api;
    }

    public Single<LoginResponseEntity> Login(String email, String password) {
        HashMap<String, String> body = new HashMap<>();
        body.put("email", email);
        body.put("password", password);
        return api.login(body);
    }
}
