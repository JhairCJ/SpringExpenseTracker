package com.jhaircjxd.expensetracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhaircjxd.expensetracker.entities.Transaction;
import com.jhaircjxd.expensetracker.repositories.TransactionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionService {
    
    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long id, Transaction transaction){
        Transaction existingTransaction = transactionRepository.findById(id)
                    .orElseThrow(()-> new RuntimeException("Transaction not found"));
        existingTransaction.setAmount(transaction.getAmount());
        existingTransaction.setCategory(transaction.getCategory());
        existingTransaction.setDate(transaction.getDate());
        existingTransaction.setDescription(transaction.getDescription());
        existingTransaction.setPeriod(transaction.getPeriod());
        existingTransaction.setType(transaction.getType());

        return transactionRepository.save(existingTransaction);
    }

    public void deleteTransaction(Long id){

    }

    //Returns transactions by period_id
    public List<Transaction> getTransactionsByPeriod(Long period_id){
        return null;
    }

    public Transaction getTransactionById(Long id){
        return null;
    }
}
