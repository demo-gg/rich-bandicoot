package com.example.payment;

import java.time.Instant;

public class PaymentResult {
    private String chargeId;
    private long amountInCents;
    private String status;
    private Instant createdAt;

    public PaymentResult(String chargeId, long amountInCents, String status, Instant createdAt) {
        this.chargeId = chargeId;
        this.amountInCents = amountInCents;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getChargeId() { return chargeId; }
    public long getAmountInCents() { return amountInCents; }
    public String getStatus() { return status; }
    public Instant getCreatedAt() { return createdAt; }
}
