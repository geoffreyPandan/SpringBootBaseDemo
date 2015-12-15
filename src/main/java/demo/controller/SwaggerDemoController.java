package demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * DemoCOntroller
 *
 * @author: sunjie
 * @date: 15/9/25
 *
 * 最简单的spring bootdemo.
 * http://localhost:8080/myspringboot/demo.do
 */
@RestController
@RequestMapping("/myspringboot")
@EnableSwagger2
public class SwaggerDemoController {
    @RequestMapping(value = "/demo3.do", method = RequestMethod.GET)
    String getDemo() {
        return "Hello World \n" + "Spring boot3";
    }

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("sample of springboot", "sample of springboot", null, null, null, null, null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/myspringboot/.*")).build()
            .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }
}
