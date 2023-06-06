package backend.formatter;

import backend.model.Customer;
import backend.services.customer.ICustomerService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Optional;

@Component
public class SampleFormatter implements Formatter<Customer> {
    private final ICustomerService sampleService;

    public SampleFormatter(ICustomerService sampleService) {
        this.sampleService = sampleService;
    }

    @Override
    public Customer parse(String text, Locale locale) {
        Optional<Customer> sampleOptional = sampleService.findById(Long.parseLong(text));
        return sampleOptional.orElse(null);
    }

    @Override
    public String print(Customer object, Locale locale) {
        return object.toString();
    }
}
