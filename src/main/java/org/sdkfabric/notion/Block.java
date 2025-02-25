/**
 * Block automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Block {
    private String object;
    private String id;
    private Page parent;
    private java.time.LocalDateTime createdTime;
    private java.time.LocalDateTime lastEditedTime;
    private User createdBy;
    private User lastEditedBy;
    private Boolean hasChildren;
    private Boolean inTrash;
    private String type;
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
    @JsonSetter("parent")
    public void setParent(Page parent) {
        this.parent = parent;
    }
    @JsonGetter("parent")
    public Page getParent() {
        return this.parent;
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
    @JsonSetter("has_children")
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
    @JsonGetter("has_children")
    public Boolean getHasChildren() {
        return this.hasChildren;
    }
    @JsonSetter("in_trash")
    public void setInTrash(Boolean inTrash) {
        this.inTrash = inTrash;
    }
    @JsonGetter("in_trash")
    public Boolean getInTrash() {
        return this.inTrash;
    }
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }
    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}
