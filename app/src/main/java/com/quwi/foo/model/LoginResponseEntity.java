
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseEntity {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("app_init")
    @Expose
    private AppInit appInit;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AppInit getAppInit() {
        return appInit;
    }

    public void setAppInit(AppInit appInit) {
        this.appInit = appInit;
    }

}
