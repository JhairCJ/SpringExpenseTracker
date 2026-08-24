package com.jhaircjxd.expensetracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhaircjxd.expensetracker.entities.CategoryPeriod;
import com.jhaircjxd.expensetracker.repositories.CategoryPeriodRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryPeriodService {

    private final CategoryPeriodRepository categoryPeriodRepository;

    public CategoryPeriod createCategoryPeriod(CategoryPeriod categoryPeriod){
        return categoryPeriodRepository.save(categoryPeriod);
    }

    public CategoryPeriod updateCategoryPeriod(Long id, CategoryPeriod categoryPeriod){
        CategoryPeriod existingCategoryPeriod = categoryPeriodRepository.findById(id)
                            .orElseThrow(() -> new RuntimeException("Category Period not found"));

        existingCategoryPeriod.setBudget(categoryPeriod.getBudget());
        existingCategoryPeriod.setSpent(categoryPeriod.getSpent());

        return categoryPeriodRepository.save(existingCategoryPeriod);
    }

    public void deleteCategoryPeriod(Long id){
        categoryPeriodRepository.deleteById(id);
    }

    //Returns category periods using a period_id
    public List<CategoryPeriod> getCategoryPeriodsByPeriod(Long period_id){
        return null;
    }
}
