package com.jhaircjxd.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhaircjxd.expensetracker.entities.Period;

public interface PeriodRepository extends JpaRepository<Period, Long> {
}
