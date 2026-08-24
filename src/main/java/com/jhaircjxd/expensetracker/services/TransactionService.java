package com.jhaircjxd.expensetracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhaircjxd.expensetracker.entities.Transaction;

@Service
public class TransactionService {

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
