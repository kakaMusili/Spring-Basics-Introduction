package com.in28minutes.spring.springin5steps;

import com.in28minutes.spring.springin5steps.basics.BinarySearchImp;
import com.in28minutes.spring.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.*;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args) {
        try
                (AnnotationConfigApplicationContext applicationContext =
                         new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

            SomeExternalService service= applicationContext.getBean(SomeExternalService.class);
            System.out.println( " output is - " + service);
            System.out.println( " output is - " + service.returnServiceUrl());


        }
    }

}
