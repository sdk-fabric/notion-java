/**
 * BlockChildPage automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class BlockChildPage extends Block {
    private ChildPage childPage;

    @JsonSetter("child_page")
    public void setChildPage(ChildPage childPage) {
        this.childPage = childPage;
    }

    @JsonGetter("child_page")
    public ChildPage getChildPage() {
        return this.childPage;
    }
}

