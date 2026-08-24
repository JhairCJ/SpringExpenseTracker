package com.jhaircjxd.expensetracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhaircjxd.expensetracker.entities.Period;
import com.jhaircjxd.expensetracker.repositories.PeriodRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PeriodService {

    private final PeriodRepository periodRepository;

    public Period createPeriod(Period period){
        return periodRepository.save(period);
    }

    public Period updatePeriod(Long id, Period period){
        Period existingPeriod = periodRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Period not found"));
        
        existingPeriod.setEarnings(period.getEarnings());
        existingPeriod.setExpenses(period.getExpenses());
        existingPeriod.setSavings(period.getSavings());
        existingPeriod.setTransactions(period.getTransactions());

        return periodRepository.save(existingPeriod);
    }

    public void deletePeriod(Long id){
        periodRepository.deleteById(id);
    }

    public List<Period> getPeriods(){
        return periodRepository.findAll();
    }

    public Period getPeriodById(Long id){
        return periodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Period not found with id: " + id));
    }
}
