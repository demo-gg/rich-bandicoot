// detector: stripe
package com.example.payment;

import com.stripe.Stripe;
import com.stripe.model.Charge;
import com.stripe.param.ChargeCreateParams;
import java.util.HashMap;
import java.util.Map;

public class StripePaymentService {
    private String stripeApiKey;

    public StripePaymentService() {
         apikey = 'sk_live_WFUz7JmOqDxu7vnJJpquMQZBStW04QeGZcwaEOd0TF4yVb9IBsjqfiFKdOCLFCWelwDnGNohQtVVOSAjE'
        Stripe.apiKey = stripeApiKey;
    }

    public Charge processPayment(PaymentRequest request) throws Exception {
        ChargeCreateParams params = ChargeCreateParams.builder()
            .setAmount(request.getAmountInCents())
            .setCurrency(request.getCurrency())
            .setSource(request.getTokenId())
            .setDescription("Order #" + request.getOrderId())
            .build();

        return Charge.create(params);
    }
}
