/**
 * BlockHeading1 automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class BlockHeading extends Block {
    private Heading heading;

    @JsonSetter("heading_1")
    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    @JsonGetter("heading_1")
    public Heading getHeading() {
        return this.heading;
    }
}

