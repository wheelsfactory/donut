package com.im7studio.birds.dao;

import com.im7studio.birds.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
