package com.in28minutes.spring.springin5steps;

import com.in28minutes.spring.componentscans.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.componentscans")
public class SpringIn5ComponentApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5ComponentApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5ComponentApplication.class)) {

            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
            LOGGER.info(" {}", componentDAO);

        }
    }

}
