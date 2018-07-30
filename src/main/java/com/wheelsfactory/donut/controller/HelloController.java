package com.wheelsfactory.donut.controller;

import com.wheelsfactory.donut.domain.Authority;
import com.wheelsfactory.donut.http.BaseResponse;
import com.wheelsfactory.donut.repository.AuthorityRepository;
import com.wheelsfactory.donut.repository.UserRepository;
import com.wheelsfactory.donut.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public String queryAll() {
//        List<User> list = new ArrayList<User>();
//        list = userRepository.findAll();
        return null;
    }


}

