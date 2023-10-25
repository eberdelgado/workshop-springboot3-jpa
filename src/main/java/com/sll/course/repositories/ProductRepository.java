package com.sll.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sll.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
