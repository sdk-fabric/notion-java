/**
 * WorkspaceParentId automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class WorkspaceParentId extends ParentId {
    private Boolean workspace;

    @JsonSetter("workspace")
    public void setWorkspace(Boolean workspace) {
        this.workspace = workspace;
    }

    @JsonGetter("workspace")
    public Boolean getWorkspace() {
        return this.workspace;
    }
}

