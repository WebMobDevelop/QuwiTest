
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Project {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("logo_url")
    @Expose
    private String logoUrl;
    @SerializedName("position")
    @Expose
    private int position;
    @SerializedName("is_active")
    @Expose
    private int isActive;
    @SerializedName("is_owner_watcher")
    @Expose
    private boolean isOwnerWatcher;
    @SerializedName("dta_user_since")
    @Expose
    private Object dtaUserSince;
    @SerializedName("users")
    @Expose
    private List<Object> users = null;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public boolean isIsOwnerWatcher() {
        return isOwnerWatcher;
    }

    public void setIsOwnerWatcher(boolean isOwnerWatcher) {
        this.isOwnerWatcher = isOwnerWatcher;
    }

    public Object getDtaUserSince() {
        return dtaUserSince;
    }

    public void setDtaUserSince(Object dtaUserSince) {
        this.dtaUserSince = dtaUserSince;
    }

    public List<Object> getUsers() {
        return users;
    }

    public void setUsers(List<Object> users) {
        this.users = users;
    }

}
