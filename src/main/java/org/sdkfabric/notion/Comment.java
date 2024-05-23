/**
 * Comment automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Comment {
    private PageId parent;
    private String discussionId;
    private RichText richText;
    @JsonSetter("parent")
    public void setParent(PageId parent) {
        this.parent = parent;
    }
    @JsonGetter("parent")
    public PageId getParent() {
        return this.parent;
    }
    @JsonSetter("discussion_id")
    public void setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
    }
    @JsonGetter("discussion_id")
    public String getDiscussionId() {
        return this.discussionId;
    }
    @JsonSetter("rich_text")
    public void setRichText(RichText richText) {
        this.richText = richText;
    }
    @JsonGetter("rich_text")
    public RichText getRichText() {
        return this.richText;
    }
}