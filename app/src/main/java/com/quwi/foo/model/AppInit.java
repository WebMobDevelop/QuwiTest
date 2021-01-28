
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AppInit {

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("user_settings_global")
    @Expose
    private UserSettingsGlobal userSettingsGlobal;
    @SerializedName("user_settings")
    @Expose
    private UserSettings userSettings;
    @SerializedName("companies")
    @Expose
    private List<Company> companies = null;
    @SerializedName("auth_items")
    @Expose
    private AuthItems authItems;
    @SerializedName("chats_count_unread")
    @Expose
    private int chatsCountUnread;
    @SerializedName("hidden_projects")
    @Expose
    private List<Object> hiddenProjects = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserSettingsGlobal getUserSettingsGlobal() {
        return userSettingsGlobal;
    }

    public void setUserSettingsGlobal(UserSettingsGlobal userSettingsGlobal) {
        this.userSettingsGlobal = userSettingsGlobal;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public AuthItems getAuthItems() {
        return authItems;
    }

    public void setAuthItems(AuthItems authItems) {
        this.authItems = authItems;
    }

    public int getChatsCountUnread() {
        return chatsCountUnread;
    }

    public void setChatsCountUnread(int chatsCountUnread) {
        this.chatsCountUnread = chatsCountUnread;
    }

    public List<Object> getHiddenProjects() {
        return hiddenProjects;
    }

    public void setHiddenProjects(List<Object> hiddenProjects) {
        this.hiddenProjects = hiddenProjects;
    }

}
