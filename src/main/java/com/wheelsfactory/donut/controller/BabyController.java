package com.wheelsfactory.donut.controller;

import com.wheelsfactory.donut.config.Constants;
import com.wheelsfactory.donut.domain.Baby;
import com.wheelsfactory.donut.http.ListResponse;
import com.wheelsfactory.donut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("baby")
public class BabyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loadBaby")
    @ResponseBody
    public ListResponse loadBabyByUsername(@RequestParam String username){
        List<Baby> babyList = userService.findBabiesByUsername(username);
        ListResponse result = new ListResponse();
        if(babyList.size()==0){
            result.setStatus(Constants.RESPONSE_EMPTY_RESULT);
            return result;
        } else {
            result.setStatus(Constants.RESPONSE_SUCCESS);
            result.getData().addAll(babyList);
            return result;
        }
    }

}
