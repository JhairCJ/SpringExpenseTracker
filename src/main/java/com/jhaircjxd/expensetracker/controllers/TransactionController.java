package com.jhaircjxd.expensetracker.controllers;

import java.util.List;

import com.jhaircjxd.expensetracker.entities.Transaction;

public class TransactionController {
    /**
     * Crear transacción
     * Actualizar transacción
     * Eliminar transacción
     * Listar transacciones
     * Obtener una transacción por id
     */

    public Transaction createTransaction(Transaction transaction){
        return null;
    }

    public Transaction updateTransaction(Long id, Transaction transaction){
        return null;
    }

    public void deleteTransaction(Long id){

    }

    //Returns transactions by period_id
    public List<Transaction> getTransactions(){
        return null;
    }

    public Transaction getTransactionById(Long id){
        return null;
    }
}
