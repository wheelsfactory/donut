package com.wheelsfactory.donut.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String nickname;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String avatarPath;

    @Getter
    @Setter
    private String mobile;

    @Getter
    @Setter
    private String email;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "tb_user_baby",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "baby_id", referencedColumnName = "id"))
    @Getter
    @Setter
    private List<Baby> baby;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_authority", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    @Getter
    @Setter
    private List<Authority> authorities;

}
