package thomastech.thomastech_Spring.controller;

import com.stripe.exception.StripeException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thomastech.thomastech_Spring.entity.CheckoutEntity;
import thomastech.thomastech_Spring.service.StripeService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular to access API
@RequiredArgsConstructor
public class StripeController {

    private final StripeService stripeService;

    @PostMapping("/checkout")
    public ResponseEntity<?> createCheckoutSession(@RequestBody CheckoutEntity checkoutEntity) throws StripeException {
        Map<String, String> errors = new HashMap<>();

        // Manually validate fields
        if (checkoutEntity.getCourseName() == null || checkoutEntity.getCourseName().isEmpty()) {
            errors.put("courseName", "Course name cannot be null or empty");
        }

        if (checkoutEntity.getPrice() == null || checkoutEntity.getPrice() <= 0) {
            errors.put("price", "Price must be greater than zero");
        }

        // If there are validation errors, return them as a bad request
        if (!errors.isEmpty()) {
            return ResponseEntity.badRequest().body(errors);
        }

        // Proceed with the Stripe session creation
        String successUrl = "http://localhost:4200/payment-success";
        String cancelUrl = "http://localhost:4200/payment-cancel";
        String checkoutUrl = stripeService.createCheckoutSession(checkoutEntity.getCourseName(), checkoutEntity.getPrice(), successUrl, cancelUrl);

        return ResponseEntity.ok(checkoutUrl); // Return the Stripe Checkout URL (no need to prepend the base URL)
    }


}
