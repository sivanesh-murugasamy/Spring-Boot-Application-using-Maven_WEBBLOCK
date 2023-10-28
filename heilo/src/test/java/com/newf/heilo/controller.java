package com.newf.heilo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
    @RequestMapping(value = "hello")
    public String hello()
    {
        return "Hello I am sivanesh";
    }
    
}
