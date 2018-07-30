package com.wheelsfactory.donut.repository;

import com.wheelsfactory.donut.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
