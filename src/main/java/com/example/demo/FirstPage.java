package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstPage {

        @RequestMapping("/")
        public String helloWorld(){
            return "First!!";
        }

}
