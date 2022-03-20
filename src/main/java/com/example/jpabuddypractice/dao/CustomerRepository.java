package com.example.jpabuddypractice.dao;

import com.example.jpabuddypractice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}