package com.wheelsfactory.donut.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "tb_authority")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Authority {
    @Id
    @GeneratedValue
    private long id;

    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
