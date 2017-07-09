package com.tw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class FraudCheckRequest {
    private String clientId;
    private long loanAmount;

    @JsonCreator
    public FraudCheckRequest(@JsonProperty("clientId") String clientId,
                             @JsonProperty("loanAmount") long loanAmount) {
        this.clientId = clientId;
        this.loanAmount = loanAmount;
    }

    long getLoanAmount() {
        return loanAmount;
    }
}
