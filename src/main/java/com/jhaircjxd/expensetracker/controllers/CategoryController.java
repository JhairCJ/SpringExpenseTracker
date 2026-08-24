package com.jhaircjxd.expensetracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhaircjxd.expensetracker.entities.Category;
import com.jhaircjxd.expensetracker.services.CategoryService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {
    /**
     * Crear categoria
     * Editar categoria
     * Eliminar categoria
     * Listar categorias
     * Obtener una categoria por id
     */

    private final CategoryService categoryService;

    @PostMapping
    public Category createCategory(@RequestBody @Valid Category category){
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody @Valid Category category){
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

    @GetMapping
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
}
