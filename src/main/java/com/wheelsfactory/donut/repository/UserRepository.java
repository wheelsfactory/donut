package com.wheelsfactory.donut.repository;

import com.wheelsfactory.donut.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername (String username);
}
