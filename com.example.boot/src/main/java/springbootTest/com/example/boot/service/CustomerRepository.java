package springbootTest.com.example.boot.service;

import org.springframework.data.repository.CrudRepository;

import springbootTest.com.example.boot.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	   Customer getCustomerByCustomerName(String customerName);
}
