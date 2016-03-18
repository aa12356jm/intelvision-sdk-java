package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainSearchResponse extends ZenoResponse {
    private String sessionId;

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
