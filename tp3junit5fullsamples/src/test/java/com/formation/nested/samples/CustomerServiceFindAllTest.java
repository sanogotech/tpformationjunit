package com.formation.nested.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.formation.customer.service.CustomerService;

public class CustomerServiceFindAllTest {

    CustomerService customerService;

    @BeforeEach
    void createNewObjectForAll() {
        System.out.println("New CustomerService()");
        //customerService = new CustomerServiceJDBC();
    }

    @Test
    void findAll_with_ids() {
        //customerService.findAllByIds(Arrays.asList(2, 3, 4));
    }

    @Test
    void findAll_with_name_likeY() {
        //customerService.findAllByName("mkyong");
    }
    
}
