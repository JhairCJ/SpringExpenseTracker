package com.jhaircjxd.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhaircjxd.expensetracker.entities.CategoryPeriod;

public interface CategoryPeriodRepository extends JpaRepository<CategoryPeriod, Long> {
}
