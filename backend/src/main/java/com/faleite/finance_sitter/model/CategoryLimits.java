package com.faleite.finance_sitter.model;

import com.faleite.finance_sitter.utils.Category;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "category_limits")
public class CategoryLimits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(name = "limit_amount", precision = 14, scale = 2)
    private BigDecimal limitAmount = BigDecimal.ZERO;

    public CategoryLimits() {
    }

    public CategoryLimits(User user, Category category, BigDecimal limitAmount) {
        this.user = user;
        this.category = category;
        this.limitAmount = limitAmount;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }
}
