package com.jhaircjxd.expensetracker.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "period")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1, message = "Month must be between 1 and 12")
    @Max(value = 12, message = "Month must be between 1 and 12")
    @Column(nullable = false)
    private Integer month;

    @Column(nullable = false)
    private Integer year;

    private Integer earnings;

    private Integer expenses;
    
    private Integer savings;

    @OneToMany(
        mappedBy = "period",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<CategoryPeriod> categoryPeriods;

    @OneToMany(
        mappedBy = "period",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Transaction> transactions;

}
