/**
 * Page automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class Page {
    private String object;
    private String id;
    private java.time.LocalDateTime createdTime;
    private java.time.LocalDateTime lastEditedTime;
    private User createdBy;
    private User lastEditedBy;
    private String cover;
    private String icon;
    private Object parent;
    private Boolean inTrash;
    private java.util.Map<String, Object> properties;
    private String url;
    private String publicUrl;

    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonGetter("object")
    public String getObject() {
        return this.object;
    }

    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    @JsonSetter("created_time")
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @JsonGetter("created_time")
    public java.time.LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    @JsonSetter("last_edited_time")
    public void setLastEditedTime(java.time.LocalDateTime lastEditedTime) {
        this.lastEditedTime = lastEditedTime;
    }

    @JsonGetter("last_edited_time")
    public java.time.LocalDateTime getLastEditedTime() {
        return this.lastEditedTime;
    }

    @JsonSetter("created_by")
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @JsonGetter("created_by")
    public User getCreatedBy() {
        return this.createdBy;
    }

    @JsonSetter("last_edited_by")
    public void setLastEditedBy(User lastEditedBy) {
        this.lastEditedBy = lastEditedBy;
    }

    @JsonGetter("last_edited_by")
    public User getLastEditedBy() {
        return this.lastEditedBy;
    }

    @JsonSetter("cover")
    public void setCover(String cover) {
        this.cover = cover;
    }

    @JsonGetter("cover")
    public String getCover() {
        return this.cover;
    }

    @JsonSetter("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonGetter("icon")
    public String getIcon() {
        return this.icon;
    }

    @JsonSetter("parent")
    public void setParent(Object parent) {
        this.parent = parent;
    }

    @JsonGetter("parent")
    public Object getParent() {
        return this.parent;
    }

    @JsonSetter("in_trash")
    public void setInTrash(Boolean inTrash) {
        this.inTrash = inTrash;
    }

    @JsonGetter("in_trash")
    public Boolean getInTrash() {
        return this.inTrash;
    }

    @JsonSetter("properties")
    public void setProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
    }

    @JsonGetter("properties")
    public java.util.Map<String, Object> getProperties() {
        return this.properties;
    }

    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }

    @JsonSetter("public_url")
    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    @JsonGetter("public_url")
    public String getPublicUrl() {
        return this.publicUrl;
    }
}

