package com.jhaircjxd.expensetracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhaircjxd.expensetracker.entities.Period;
import com.jhaircjxd.expensetracker.services.PeriodService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/period")
@RequiredArgsConstructor
public class PeriodController {
    /**
     * Crear periodo
     * Actualizar periodo
     * Eliminar periodo
     * Listar periodos
     * Obtener un periodo por id
     */

    private final PeriodService periodService;

    @PostMapping
    public Period createPeriod(@RequestBody @Valid Period period){
        return periodService.createPeriod(period);
    }

    @PutMapping("/{id}")
    public Period updatePeriod(@PathVariable Long id, @RequestBody @Valid Period period){
        return periodService.createPeriod(period);
    }

    @DeleteMapping("/{id}")
    public void deletePeriod(@PathVariable Long id){
        periodService.deletePeriod(id);
    }

    @GetMapping
    public List<Period> getPeriods(){
        return periodService.getPeriods();
    }

    @GetMapping("/{id}")
    public Period getPeriodById(@PathVariable Long id){
        return periodService.getPeriodById(id);
    }
}
