
package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthItems {

    @SerializedName("owner")
    @Expose
    private boolean owner;
    @SerializedName("coder")
    @Expose
    private boolean coder;
    @SerializedName("disc_space")
    @Expose
    private boolean discSpace;
    @SerializedName("tracked_timer_month")
    @Expose
    private boolean trackedTimerMonth;
    @SerializedName("screens_month")
    @Expose
    private boolean screensMonth;
    @SerializedName("chat")
    @Expose
    private boolean chat;
    @SerializedName("instant_screen")
    @Expose
    private boolean instantScreen;
    @SerializedName("timelapse_video")
    @Expose
    private boolean timelapseVideo;
    @SerializedName("member_area")
    @Expose
    private boolean memberArea;
    @SerializedName("trial")
    @Expose
    private boolean trial;

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public boolean isCoder() {
        return coder;
    }

    public void setCoder(boolean coder) {
        this.coder = coder;
    }

    public boolean isDiscSpace() {
        return discSpace;
    }

    public void setDiscSpace(boolean discSpace) {
        this.discSpace = discSpace;
    }

    public boolean isTrackedTimerMonth() {
        return trackedTimerMonth;
    }

    public void setTrackedTimerMonth(boolean trackedTimerMonth) {
        this.trackedTimerMonth = trackedTimerMonth;
    }

    public boolean isScreensMonth() {
        return screensMonth;
    }

    public void setScreensMonth(boolean screensMonth) {
        this.screensMonth = screensMonth;
    }

    public boolean isChat() {
        return chat;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public boolean isInstantScreen() {
        return instantScreen;
    }

    public void setInstantScreen(boolean instantScreen) {
        this.instantScreen = instantScreen;
    }

    public boolean isTimelapseVideo() {
        return timelapseVideo;
    }

    public void setTimelapseVideo(boolean timelapseVideo) {
        this.timelapseVideo = timelapseVideo;
    }

    public boolean isMemberArea() {
        return memberArea;
    }

    public void setMemberArea(boolean memberArea) {
        this.memberArea = memberArea;
    }

    public boolean isTrial() {
        return trial;
    }

    public void setTrial(boolean trial) {
        this.trial = trial;
    }

}
