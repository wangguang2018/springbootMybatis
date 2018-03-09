package org.wangguang;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@MapperScan("org.wangguang.mapper")
public class SampleController {



    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }



    /*@Autowired
    private Person person;

    @ResponseBody
    @GetMapping("/say")
    public String hello() {
        return "myName:"+ person.getName()+"; age:"+person.getAge();
    }*/


}