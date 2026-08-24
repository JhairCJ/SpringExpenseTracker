package com.jhaircjxd.expensetracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.jhaircjxd.expensetracker.entities.CategoryPeriod;
import com.jhaircjxd.expensetracker.services.CategoryPeriodService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api/categoryPeriod")
@RequiredArgsConstructor
public class CategoryPeriodController {
    /**
     * Crear categoria periodo
     * Actualizar categoria periodo
     * Eliminar categoria periodo
     * Obtener lista de categoria periodo por periodo
     */
    private final CategoryPeriodService categoryPeriodService;

    @PostMapping
    public CategoryPeriod createCategoryPeriod(@RequestBody @Valid CategoryPeriod categoryPeriod){
        return categoryPeriodService.createCategoryPeriod(categoryPeriod);
    }

    @PutMapping("/{id}")
    public CategoryPeriod updateCategoryPeriod(@PathVariable Long id, @RequestBody @Valid CategoryPeriod categoryPeriod){
        return categoryPeriodService.updateCategoryPeriod(id, categoryPeriod);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryPeriod(@PathVariable Long id){
        categoryPeriodService.deleteCategoryPeriod(id);
    }

    //Returns category periods using a period_id
    @GetMapping
    public List<CategoryPeriod> getCategoryPeriodsByPeriod(Long period_id){
        return categoryPeriodService.getCategoryPeriodsByPeriod(period_id);
    }
}
