package com.jhaircjxd.expensetracker.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "category_period")
@Builder
public class CategoryPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private BigDecimal spent;

    private BigDecimal budget;

    //TODO: relations
    @ManyToOne
    @JoinColumn(name = "period_id", nullable = false)
    private Period period;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
