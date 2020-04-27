package com.manikanta;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineServices {

    @RequestMapping("/hello")
    public String tempMethod(){
        return "Hello OpenShift";
    }
}
