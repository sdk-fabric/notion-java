/**
 * Code automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class Code {
    private java.util.List<RichText> caption;
    private java.util.List<RichText> richText;
    private String language;

    @JsonSetter("caption")
    public void setCaption(java.util.List<RichText> caption) {
        this.caption = caption;
    }

    @JsonGetter("caption")
    public java.util.List<RichText> getCaption() {
        return this.caption;
    }

    @JsonSetter("rich_text")
    public void setRichText(java.util.List<RichText> richText) {
        this.richText = richText;
    }

    @JsonGetter("rich_text")
    public java.util.List<RichText> getRichText() {
        return this.richText;
    }

    @JsonSetter("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonGetter("language")
    public String getLanguage() {
        return this.language;
    }
}

