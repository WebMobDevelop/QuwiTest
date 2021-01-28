package com.quwi.foo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Issue {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id_company")
    @Expose
    private int idCompany;
    @SerializedName("id_project")
    @Expose
    private int idProject;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id_user")
    @Expose
    private int idUser;
    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("id_assigned_user")
    @Expose
    private Object idAssignedUser;
    @SerializedName("assignee_name")
    @Expose
    private String assigneeName;
    @SerializedName("id_category")
    @Expose
    private Object idCategory;
    @SerializedName("tag1")
    @Expose
    private String tag1;
    @SerializedName("priority_weight")
    @Expose
    private int priorityWeight;
    @SerializedName("is_bug")
    @Expose
    private boolean isBug;
    @SerializedName("dta_create")
    @Expose
    private String dtaCreate;
    @SerializedName("dta_last_event")
    @Expose
    private String dtaLastEvent;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_open")
    @Expose
    private boolean isOpen;
    @SerializedName("is_recently_resolved")
    @Expose
    private boolean isRecentlyResolved;
    @SerializedName("description_type")
    @Expose
    private String descriptionType;
    @SerializedName("is_starred")
    @Expose
    private boolean isStarred;
    @SerializedName("unread_events")
    @Expose
    private int unreadEvents;
    @SerializedName("spent_time")
    @Expose
    private int spentTime;
    @SerializedName("spent_time_bugs")
    @Expose
    private int spentTimeBugs;
    @SerializedName("estimated_time")
    @Expose
    private int estimatedTime;
    @SerializedName("percent_done")
    @Expose
    private int percentDone;
    @SerializedName("is_read")
    @Expose
    private boolean isRead;
    @SerializedName("is_active")
    @Expose
    private boolean isActive;
    @SerializedName("is_shared")
    @Expose
    private int isShared;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("device")
    @Expose
    private String device;
    @SerializedName("watchersExclude")
    @Expose
    private List<Object> watchersExclude = null;
    @SerializedName("participants")
    @Expose
    private List<Object> participants = null;
    @SerializedName("thumb")
    @Expose
    private Object thumb;
    @SerializedName("thumb_medium")
    @Expose
    private Object thumbMedium;
    @SerializedName("dta_due_on")
    @Expose
    private Object dtaDueOn;
    @SerializedName("is_block_due_on")
    @Expose
    private boolean isBlockDueOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Object getIdAssignedUser() {
        return idAssignedUser;
    }

    public void setIdAssignedUser(Object idAssignedUser) {
        this.idAssignedUser = idAssignedUser;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public Object getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Object idCategory) {
        this.idCategory = idCategory;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public int getPriorityWeight() {
        return priorityWeight;
    }

    public void setPriorityWeight(int priorityWeight) {
        this.priorityWeight = priorityWeight;
    }

    public boolean isIsBug() {
        return isBug;
    }

    public void setIsBug(boolean isBug) {
        this.isBug = isBug;
    }

    public String getDtaCreate() {
        return dtaCreate;
    }

    public void setDtaCreate(String dtaCreate) {
        this.dtaCreate = dtaCreate;
    }

    public String getDtaLastEvent() {
        return dtaLastEvent;
    }

    public void setDtaLastEvent(String dtaLastEvent) {
        this.dtaLastEvent = dtaLastEvent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isIsRecentlyResolved() {
        return isRecentlyResolved;
    }

    public void setIsRecentlyResolved(boolean isRecentlyResolved) {
        this.isRecentlyResolved = isRecentlyResolved;
    }

    public String getDescriptionType() {
        return descriptionType;
    }

    public void setDescriptionType(String descriptionType) {
        this.descriptionType = descriptionType;
    }

    public boolean isIsStarred() {
        return isStarred;
    }

    public void setIsStarred(boolean isStarred) {
        this.isStarred = isStarred;
    }

    public int getUnreadEvents() {
        return unreadEvents;
    }

    public void setUnreadEvents(int unreadEvents) {
        this.unreadEvents = unreadEvents;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getSpentTimeBugs() {
        return spentTimeBugs;
    }

    public void setSpentTimeBugs(int spentTimeBugs) {
        this.spentTimeBugs = spentTimeBugs;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getPercentDone() {
        return percentDone;
    }

    public void setPercentDone(int percentDone) {
        this.percentDone = percentDone;
    }

    public boolean isIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getIsShared() {
        return isShared;
    }

    public void setIsShared(int isShared) {
        this.isShared = isShared;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public List<Object> getWatchersExclude() {
        return watchersExclude;
    }

    public void setWatchersExclude(List<Object> watchersExclude) {
        this.watchersExclude = watchersExclude;
    }

    public List<Object> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Object> participants) {
        this.participants = participants;
    }

    public Object getThumb() {
        return thumb;
    }

    public void setThumb(Object thumb) {
        this.thumb = thumb;
    }

    public Object getThumbMedium() {
        return thumbMedium;
    }

    public void setThumbMedium(Object thumbMedium) {
        this.thumbMedium = thumbMedium;
    }

    public Object getDtaDueOn() {
        return dtaDueOn;
    }

    public void setDtaDueOn(Object dtaDueOn) {
        this.dtaDueOn = dtaDueOn;
    }

    public boolean isIsBlockDueOn() {
        return isBlockDueOn;
    }

    public void setIsBlockDueOn(boolean isBlockDueOn) {
        this.isBlockDueOn = isBlockDueOn;
    }

}
