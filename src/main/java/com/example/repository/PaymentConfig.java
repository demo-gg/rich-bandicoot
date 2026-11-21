package com.example.payment;

public class PaymentConfig {
    private String apiVersion;
    private int requestTimeoutSeconds;
    private boolean productionMode;
    private String webhookEndpoint;

    public PaymentConfig(String apiVersion, int requestTimeoutSeconds,
                        boolean productionMode, String webhookEndpoint) {
        this.apiVersion = apiVersion;
        this.requestTimeoutSeconds = requestTimeoutSeconds;
        this.productionMode = productionMode;
        this.webhookEndpoint = webhookEndpoint;
    }

    public String getApiVersion() { return apiVersion; }
    public int getRequestTimeoutSeconds() { return requestTimeoutSeconds; }
    public boolean isProductionMode() { return productionMode; }
    public String getWebhookEndpoint() { return webhookEndpoint; }
}
