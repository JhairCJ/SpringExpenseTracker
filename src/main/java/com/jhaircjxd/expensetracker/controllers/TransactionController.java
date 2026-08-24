package com.jhaircjxd.expensetracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhaircjxd.expensetracker.entities.Transaction;
import com.jhaircjxd.expensetracker.services.TransactionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/transaction")
@RequiredArgsConstructor
public class TransactionController {
    /**
     * Crear transacción
     * Actualizar transacción
     * Eliminar transacción
     * Listar transacciones
     * Obtener una transacción por id
     */

    private final TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody @Valid Transaction transaction){
        return transactionService.createTransaction(transaction);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody @Valid Transaction transaction){
        return transactionService.updateTransaction(id, transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id){
        transactionService.deleteTransaction(id);
    }

    //Returns transactions by period_id
    @GetMapping
    public List<Transaction> getTransactions(){
        return transactionService.getTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id){
        return transactionService.getTransactionById(id);
    }
}
