/**
 * BlockHeading2 automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class BlockHeading extends Block {
    private BlockHeading heading;

    @JsonSetter("heading_2")
    public void setHeading(BlockHeading heading) {
        this.heading = heading;
    }

    @JsonGetter("heading_2")
    public BlockHeading getHeading() {
        return this.heading;
    }
}

