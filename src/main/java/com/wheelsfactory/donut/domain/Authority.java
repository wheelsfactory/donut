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
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String role;

}
