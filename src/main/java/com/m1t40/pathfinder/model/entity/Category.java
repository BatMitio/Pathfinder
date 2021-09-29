package com.m1t40.pathfinder.model.entity;

import com.m1t40.pathfinder.model.entity.enums.CategoryNameEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private CategoryNameEnum name;
    @Column(columnDefinition = "TEXT")
    private String description;

    public Category() {
    }

    public CategoryNameEnum getName() {
        return name;
    }

    public Category setName(CategoryNameEnum name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }
}
