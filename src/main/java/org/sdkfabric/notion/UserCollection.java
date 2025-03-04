/**
 * UserCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.notion;

import com.fasterxml.jackson.annotation.*;

public class UserCollection {
    private java.util.List<User> results;
    private String nextCursor;
    private Boolean hasMore;

    @JsonSetter("results")
    public void setResults(java.util.List<User> results) {
        this.results = results;
    }

    @JsonGetter("results")
    public java.util.List<User> getResults() {
        return this.results;
    }

    @JsonSetter("next_cursor")
    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    @JsonGetter("next_cursor")
    public String getNextCursor() {
        return this.nextCursor;
    }

    @JsonSetter("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonGetter("has_more")
    public Boolean getHasMore() {
        return this.hasMore;
    }
}

