/**
 * Equation automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class Equation {
    private String expression;

    @JsonSetter("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    @JsonGetter("expression")
    public String getExpression() {
        return this.expression;
    }
}

