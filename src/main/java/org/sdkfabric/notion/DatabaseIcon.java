/**
 * DatabaseIcon automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class DatabaseIcon {
    private String type;
    private String emoji;

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }

    @JsonSetter("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    @JsonGetter("emoji")
    public String getEmoji() {
        return this.emoji;
    }
}

