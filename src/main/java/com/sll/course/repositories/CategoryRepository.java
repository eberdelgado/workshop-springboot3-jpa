package com.sll.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sll.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
