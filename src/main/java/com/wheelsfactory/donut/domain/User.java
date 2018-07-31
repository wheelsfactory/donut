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

    @Id
    @GeneratedValue
    private long id;

    private String nickname;

    private String password;

    private String username;

    private String avatarPath;

    private String mobile;

    private String email;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "tb_user_baby",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "baby_id", referencedColumnName = "id"))
    private List<Baby> baby;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_authority", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private List<Authority> authorities;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Baby> getBaby() {
        return baby;
    }

    public void setBaby(List<Baby> baby) {
        this.baby = baby;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
