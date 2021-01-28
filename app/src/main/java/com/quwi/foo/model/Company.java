
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo_url")
    @Expose
    private Object logoUrl;
    @SerializedName("owner_fullname")
    @Expose
    private String ownerFullname;
    @SerializedName("dta_create")
    @Expose
    private String dtaCreate;
    @SerializedName("id_user")
    @Expose
    private int idUser;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("timezone_offset")
    @Expose
    private int timezoneOffset;
    @SerializedName("screens_interval")
    @Expose
    private int screensInterval;
    @SerializedName("screens_quality")
    @Expose
    private int screensQuality;
    @SerializedName("updated")
    @Expose
    private int updated;
    @SerializedName("max_file_count")
    @Expose
    private int maxFileCount;
    @SerializedName("max_file_size")
    @Expose
    private int maxFileSize;
    @SerializedName("is_plan_almost_used")
    @Expose
    private boolean isPlanAlmostUsed;
    @SerializedName("is_my")
    @Expose
    private boolean isMy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getOwnerFullname() {
        return ownerFullname;
    }

    public void setOwnerFullname(String ownerFullname) {
        this.ownerFullname = ownerFullname;
    }

    public String getDtaCreate() {
        return dtaCreate;
    }

    public void setDtaCreate(String dtaCreate) {
        this.dtaCreate = dtaCreate;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public int getScreensInterval() {
        return screensInterval;
    }

    public void setScreensInterval(int screensInterval) {
        this.screensInterval = screensInterval;
    }

    public int getScreensQuality() {
        return screensQuality;
    }

    public void setScreensQuality(int screensQuality) {
        this.screensQuality = screensQuality;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getMaxFileCount() {
        return maxFileCount;
    }

    public void setMaxFileCount(int maxFileCount) {
        this.maxFileCount = maxFileCount;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public boolean isIsPlanAlmostUsed() {
        return isPlanAlmostUsed;
    }

    public void setIsPlanAlmostUsed(boolean isPlanAlmostUsed) {
        this.isPlanAlmostUsed = isPlanAlmostUsed;
    }

    public boolean isIsMy() {
        return isMy;
    }

    public void setIsMy(boolean isMy) {
        this.isMy = isMy;
    }

}
