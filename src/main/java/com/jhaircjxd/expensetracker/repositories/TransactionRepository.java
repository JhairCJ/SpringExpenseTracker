package com.jhaircjxd.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhaircjxd.expensetracker.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
