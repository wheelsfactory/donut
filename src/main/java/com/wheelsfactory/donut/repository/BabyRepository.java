package com.wheelsfactory.donut.repository;

import com.wheelsfactory.donut.domain.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepository extends JpaRepository<Baby, String> {

}
