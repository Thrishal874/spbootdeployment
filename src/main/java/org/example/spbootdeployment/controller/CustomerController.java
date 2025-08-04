package org.example.spbootdeployment.controller;

import lombok.RequiredArgsConstructor;
import org.example.spbootdeployment.entity.Customer;
import org.example.spbootdeployment.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "customer 123";
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }
}
