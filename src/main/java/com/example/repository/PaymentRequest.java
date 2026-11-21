package com.example.payment;

public class PaymentRequest {
    private long amountInCents;
    private String currency;
    private String tokenId;
    private String orderId;

    public PaymentRequest(long amountInCents, String currency, String tokenId, String orderId) {
        this.amountInCents = amountInCents;
        this.currency = currency;
        this.tokenId = tokenId;
        this.orderId = orderId;
    }

    public long getAmountInCents() { return amountInCents; }
    public String getCurrency() { return currency; }
    public String getTokenId() { return tokenId; }
    public String getOrderId() { return orderId; }
}
