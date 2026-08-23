package com.jhaircjxd.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhaircjxd.expensetracker.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
