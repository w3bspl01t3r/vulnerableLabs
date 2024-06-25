package com.example.jdbcInjection;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

@RestController
public class testcntrl {

    @GetMapping("/jdbcdata")
    public void test(@RequestParam String jstr)
    {
        try{
            String url=jstr;
            Connection conn = DriverManager.getConnection(url);
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
