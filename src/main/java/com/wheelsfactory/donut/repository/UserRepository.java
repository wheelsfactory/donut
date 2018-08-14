package com.wheelsfactory.donut.repository;

import com.wheelsfactory.donut.domain.Baby;
import com.wheelsfactory.donut.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername (String username);

    List<Baby> findBabiesByUsername(String username);

}
