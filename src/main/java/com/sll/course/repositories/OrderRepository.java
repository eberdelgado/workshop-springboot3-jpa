package com.sll.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sll.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
