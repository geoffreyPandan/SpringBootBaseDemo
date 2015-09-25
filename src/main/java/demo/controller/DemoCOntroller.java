package demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoCOntroller
 *
 * @author: sunjie
 * @date: 15/9/25
 */
@RestController
@EnableAutoConfiguration
public class DemoCOntroller {

    @RequestMapping("/")
    String  getDemo(){
        return  "Hello World Spring boot";
    }
}
