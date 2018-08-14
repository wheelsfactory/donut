package com.wheelsfactory.donut.controller;

import com.wheelsfactory.donut.domain.Authority;
import com.wheelsfactory.donut.domain.Baby;
import com.wheelsfactory.donut.domain.User;
import com.wheelsfactory.donut.http.BaseResponse;
import com.wheelsfactory.donut.repository.AuthorityRepository;
import com.wheelsfactory.donut.repository.BabyRepository;
import com.wheelsfactory.donut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class indexController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BabyRepository babyRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/init")
    public BaseResponse init() {
        BaseResponse response = new BaseResponse();

        Authority authority = new Authority();
        authority.setRole("ADMIN");
        this.authorityRepository.save(authority);

        List<Authority> authorities = new ArrayList<>();
        authorities.add(authority);

        User admin = new User();
        admin.setUsername("admin@donut");
        admin.setPassword(this.bCryptPasswordEncoder.encode("123456"));
        admin.setAuthorities(authorities);
        this.userRepository.save(admin);

        Baby baby = new Baby();
        baby.setAge(0.2f);
        baby.setGender(1);
        baby.setName("Derek");
        this.babyRepository.save(baby);

        response.setStatus(0);
        response.setMessage("success");
        return response;
    }
}
