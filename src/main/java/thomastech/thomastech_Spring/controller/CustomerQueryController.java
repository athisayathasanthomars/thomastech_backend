package thomastech.thomastech_Spring.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import thomastech.thomastech_Spring.entity.CustomerQuery;
import thomastech.thomastech_Spring.service.CustomerQueryService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class CustomerQueryController {
    private final CustomerQueryService customerQueryService;

    @PostMapping("/customerquery")
    public ResponseEntity<?> postCustomerQuery(@Valid @RequestBody CustomerQuery customerquery, BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            result.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }

        CustomerQuery savedQuery = customerQueryService.postCustomerQuery(customerquery);
        return ResponseEntity.ok(savedQuery);
    }
}
