
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserSettings {

    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("mute_until_period")
    @Expose
    private int muteUntilPeriod;
    @SerializedName("is_mute_chats")
    @Expose
    private boolean isMuteChats;
    @SerializedName("dta_mute_until")
    @Expose
    private Object dtaMuteUntil;
    @SerializedName("client_settings")
    @Expose
    private Object clientSettings;
    @SerializedName("cache_updated")
    @Expose
    private boolean cacheUpdated;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getMuteUntilPeriod() {
        return muteUntilPeriod;
    }

    public void setMuteUntilPeriod(int muteUntilPeriod) {
        this.muteUntilPeriod = muteUntilPeriod;
    }

    public boolean isIsMuteChats() {
        return isMuteChats;
    }

    public void setIsMuteChats(boolean isMuteChats) {
        this.isMuteChats = isMuteChats;
    }

    public Object getDtaMuteUntil() {
        return dtaMuteUntil;
    }

    public void setDtaMuteUntil(Object dtaMuteUntil) {
        this.dtaMuteUntil = dtaMuteUntil;
    }

    public Object getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(Object clientSettings) {
        this.clientSettings = clientSettings;
    }

    public boolean isCacheUpdated() {
        return cacheUpdated;
    }

    public void setCacheUpdated(boolean cacheUpdated) {
        this.cacheUpdated = cacheUpdated;
    }

}
