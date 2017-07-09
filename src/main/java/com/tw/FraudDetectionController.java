package com.tw;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudDetectionController {

    @PutMapping(value = "fraudcheck")
    public FraudCheckResponse checkFraud(@RequestBody FraudCheckRequest fraudCheckCommand) {
        if (fraudCheckCommand.getLoanAmount() > 2000) {
            return new FraudCheckResponse("FRAUD", "Amount too high");
        }

        return new FraudCheckResponse("OK", "Approved");
    }
}
