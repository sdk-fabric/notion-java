/**
 * DatabaseCover automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class DatabaseCover {
    private String type;
    private Object external;
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }
    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
    @JsonSetter("external")
    public void setExternal(Object external) {
        this.external = external;
    }
    @JsonGetter("external")
    public Object getExternal() {
        return this.external;
    }
}