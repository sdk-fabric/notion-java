/**
 * PageId automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class PageId {
    private String pageId;
    @JsonSetter("page_id")
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    @JsonGetter("page_id")
    public String getPageId() {
        return this.pageId;
    }
}
