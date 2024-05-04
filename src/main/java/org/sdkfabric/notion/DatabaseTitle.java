/**
 * DatabaseTitle automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class DatabaseTitle {
    private String type;
    private String text;
    private DatabaseAnnotations annotations;
    private String plainText;
    private String href;
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }
    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }
    @JsonGetter("text")
    public String getText() {
        return this.text;
    }
    @JsonSetter("annotations")
    public void setAnnotations(DatabaseAnnotations annotations) {
        this.annotations = annotations;
    }
    @JsonGetter("annotations")
    public DatabaseAnnotations getAnnotations() {
        return this.annotations;
    }
    @JsonSetter("plain_text")
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
    @JsonGetter("plain_text")
    public String getPlainText() {
        return this.plainText;
    }
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }
    @JsonGetter("href")
    public String getHref() {
        return this.href;
    }
}
