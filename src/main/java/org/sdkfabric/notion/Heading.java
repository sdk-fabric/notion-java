/**
 * Heading automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class Heading {
    private java.util.List<RichText> richText;
    private String color;
    private Boolean isToggleable;

    @JsonSetter("rich_text")
    public void setRichText(java.util.List<RichText> richText) {
        this.richText = richText;
    }

    @JsonGetter("rich_text")
    public java.util.List<RichText> getRichText() {
        return this.richText;
    }

    @JsonSetter("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonGetter("color")
    public String getColor() {
        return this.color;
    }

    @JsonSetter("is_toggleable")
    public void setIsToggleable(Boolean isToggleable) {
        this.isToggleable = isToggleable;
    }

    @JsonGetter("is_toggleable")
    public Boolean getIsToggleable() {
        return this.isToggleable;
    }
}

