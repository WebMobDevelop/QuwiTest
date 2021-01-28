
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserSettingsGlobal {

    @SerializedName("client_settings")
    @Expose
    private Object clientSettings;

    public Object getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(Object clientSettings) {
        this.clientSettings = clientSettings;
    }

}
