package com.crocusoft.batchexample.repository;

import com.crocusoft.batchexample.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
