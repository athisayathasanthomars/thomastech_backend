package thomastech.thomastech_Spring.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StripeService {

    @Value("${stripe.api.secret.key}")
    private String secretKey;

    public String createCheckoutSession(String courseName, Long price, String successUrl, String cancelUrl) throws StripeException {
        Stripe.apiKey = secretKey;

        // Create a checkout session and pass the SessionCreateParams directly
        Session session = Session.create(buildSessionParams(courseName, price, successUrl, cancelUrl));

        return session.getUrl(); // Return Stripe Checkout URL
    }

    private SessionCreateParams buildSessionParams(String courseName, Long price, String successUrl, String cancelUrl) {
        return SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl(successUrl)
                .setCancelUrl(cancelUrl)
                .addLineItem(buildLineItem(courseName, price))
                .build();
    }

    private SessionCreateParams.LineItem buildLineItem(String courseName, Long price) {
        return SessionCreateParams.LineItem.builder()
                .setPriceData(buildPriceData(courseName, price))
                .setQuantity(1L)
                .build();
    }

    private SessionCreateParams.LineItem.PriceData buildPriceData(String courseName, Long price) {
        return SessionCreateParams.LineItem.PriceData.builder()
                .setCurrency("lkr")
                .setUnitAmount(price)
                .setProductData(buildProductData(courseName))
                .build();
    }

    private SessionCreateParams.LineItem.PriceData.ProductData buildProductData(String courseName) {
        return SessionCreateParams.LineItem.PriceData.ProductData.builder()
                .setName(courseName)
                .build();
    }
}
