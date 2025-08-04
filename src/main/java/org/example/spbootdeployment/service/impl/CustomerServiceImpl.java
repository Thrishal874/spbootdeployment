package org.example.spbootdeployment.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spbootdeployment.entity.Customer;
import org.example.spbootdeployment.repo.CustomerRepo;
import org.example.spbootdeployment.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
