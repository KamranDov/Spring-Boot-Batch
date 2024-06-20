package com.crocusoft.batchexample.service;

import com.crocusoft.batchexample.domain.Customer;
import com.crocusoft.batchexample.repository.CustomerRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void createFakeCustomer() {
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            Customer customer = Customer.builder()
                    .firstName(faker.name().firstName())
                    .lastName(faker.name().lastName())
                    .city(faker.address().cityName())
                    .age(faker.number().numberBetween(0, 100))
                    .phoneNumber(faker.phoneNumber().cellPhone())
                    .email(faker.internet().emailAddress())
                    .build();
            customerRepository.save(customer);
        }
    }
}
