/**
 * DatabaseText automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class DatabaseText {
    private String content;
    private String link;

    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonGetter("content")
    public String getContent() {
        return this.content;
    }

    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonGetter("link")
    public String getLink() {
        return this.link;
    }
}

