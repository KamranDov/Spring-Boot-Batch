package com.crocusoft.batchexample.controller;

import com.crocusoft.batchexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Void> createFakeCustomer() {
        customerService.createFakeCustomer();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
