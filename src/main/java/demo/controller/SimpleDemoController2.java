package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoCOntroller
 *
 * @author: sunjie
 * @date: 15/9/25
 *
 * 最简单的spring bootdemo.
 * http://localhost:8080/myspringboot/demo.do
 */
//@RestController
@RequestMapping("/myspringboot")
public class SimpleDemoController2 {
    @RequestMapping(value = "/demo2.do", method = RequestMethod.GET)

    String  getDemo(){
        return  "Hello World \n" +
                "Spring boot2";
    }
}
