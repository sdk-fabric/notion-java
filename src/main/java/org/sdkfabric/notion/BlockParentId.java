/**
 * BlockParentId automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class BlockParentId extends ParentId {
    private String blockId;

    @JsonSetter("block_id")
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    @JsonGetter("block_id")
    public String getBlockId() {
        return this.blockId;
    }
}

