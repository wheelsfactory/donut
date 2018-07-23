package com.wheelsfactory.donut.dao;

import com.wheelsfactory.donut.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
