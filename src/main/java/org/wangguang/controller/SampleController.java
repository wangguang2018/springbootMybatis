package org.wangguang.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wangguang.controller.entity.Person;

@Controller
@SpringBootApplication
public class SampleController {
    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }

    @Autowired
    private Person person;

    @ResponseBody
    @GetMapping("/say")
    public String hello() {
        return "myName:"+ person.getName()+"; age:"+person.getAge();
    }
}