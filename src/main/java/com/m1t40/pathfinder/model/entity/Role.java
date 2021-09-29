package com.m1t40.pathfinder.model.entity;

import com.m1t40.pathfinder.model.entity.enums.RoleNameEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;

    public Role() {
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public Role setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}
