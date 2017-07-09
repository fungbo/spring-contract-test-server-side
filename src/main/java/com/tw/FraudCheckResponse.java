package com.tw;

import com.fasterxml.jackson.annotation.JsonProperty;

class FraudCheckResponse {
    @JsonProperty("fraudCheckStatus")
    private String fraudCheckStatus;
    @JsonProperty("rejectionReason")
    private String rejectionReason;

    FraudCheckResponse(String fraudCheckStatus, String rejectionReason) {
        this.fraudCheckStatus = fraudCheckStatus;
        this.rejectionReason = rejectionReason;
    }
}
