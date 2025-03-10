package thomastech.thomastech_Spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thomastech.thomastech_Spring.entity.CustomerQuery;
import thomastech.thomastech_Spring.repository.CustomerQueryRepository;


@Service
@RequiredArgsConstructor
public class CustomerQueryService {
    private final CustomerQueryRepository customerQueryRepository;

    public CustomerQuery postCustomerQuery(CustomerQuery customerquery) {
        customerquery.setStatus("New");
        return customerQueryRepository.save(customerquery);
    }
}
