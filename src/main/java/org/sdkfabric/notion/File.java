/**
 * File automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class File {
    private java.util.List<RichText> caption;
    private FileObject file;
    private String name;

    @JsonSetter("caption")
    public void setCaption(java.util.List<RichText> caption) {
        this.caption = caption;
    }

    @JsonGetter("caption")
    public java.util.List<RichText> getCaption() {
        return this.caption;
    }

    @JsonSetter("file")
    public void setFile(FileObject file) {
        this.file = file;
    }

    @JsonGetter("file")
    public FileObject getFile() {
        return this.file;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
}

