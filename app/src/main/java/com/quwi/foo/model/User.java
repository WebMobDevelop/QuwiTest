
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("dta_create")
    @Expose
    private String dtaCreate;
    @SerializedName("timezone_offset")
    @Expose
    private int timezoneOffset;
    @SerializedName("is_online")
    @Expose
    private int isOnline;
    @SerializedName("dta_activity")
    @Expose
    private String dtaActivity;
    @SerializedName("is_active")
    @Expose
    private boolean isActive;
    @SerializedName("id_company")
    @Expose
    private int idCompany;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("due_penalties")
    @Expose
    private int duePenalties;
    @SerializedName("is_timer_online")
    @Expose
    private int isTimerOnline;
    @SerializedName("dta_timer_activity")
    @Expose
    private Object dtaTimerActivity;
    @SerializedName("timer_last")
    @Expose
    private Object timerLast;
    @SerializedName("is_shared_from_me")
    @Expose
    private boolean isSharedFromMe;
    @SerializedName("projects")
    @Expose
    private List<Object> projects = null;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("is_telegram_connected")
    @Expose
    private boolean isTelegramConnected;
    @SerializedName("telegram_connect_url")
    @Expose
    private String telegramConnectUrl;

    public int getId() {
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDtaCreate() {
        return dtaCreate;
    }

    public void setDtaCreate(String dtaCreate) {
        this.dtaCreate = dtaCreate;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public int getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(int isOnline) {
        this.isOnline = isOnline;
    }

    public String getDtaActivity() {
        return dtaActivity;
    }

    public void setDtaActivity(String dtaActivity) {
        this.dtaActivity = dtaActivity;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDuePenalties() {
        return duePenalties;
    }

    public void setDuePenalties(int duePenalties) {
        this.duePenalties = duePenalties;
    }

    public int getIsTimerOnline() {
        return isTimerOnline;
    }

    public void setIsTimerOnline(int isTimerOnline) {
        this.isTimerOnline = isTimerOnline;
    }

    public Object getDtaTimerActivity() {
        return dtaTimerActivity;
    }

    public void setDtaTimerActivity(Object dtaTimerActivity) {
        this.dtaTimerActivity = dtaTimerActivity;
    }

    public Object getTimerLast() {
        return timerLast;
    }

    public void setTimerLast(Object timerLast) {
        this.timerLast = timerLast;
    }

    public boolean isIsSharedFromMe() {
        return isSharedFromMe;
    }

    public void setIsSharedFromMe(boolean isSharedFromMe) {
        this.isSharedFromMe = isSharedFromMe;
    }

    public List<Object> getProjects() {
        return projects;
    }

    public void setProjects(List<Object> projects) {
        this.projects = projects;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsTelegramConnected() {
        return isTelegramConnected;
    }

    public void setIsTelegramConnected(boolean isTelegramConnected) {
        this.isTelegramConnected = isTelegramConnected;
    }

    public String getTelegramConnectUrl() {
        return telegramConnectUrl;
    }

    public void setTelegramConnectUrl(String telegramConnectUrl) {
        this.telegramConnectUrl = telegramConnectUrl;
    }

}
