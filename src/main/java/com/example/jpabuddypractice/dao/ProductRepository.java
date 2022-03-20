package com.example.jpabuddypractice.dao;

import com.example.jpabuddypractice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}