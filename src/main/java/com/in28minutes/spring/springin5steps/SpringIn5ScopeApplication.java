package com.in28minutes.spring.springin5steps;

import com.in28minutes.spring.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5ScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5ScopeApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5ScopeApplication.class)) {

            PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
            PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
            LOGGER.info(" {}", personDAO);
            LOGGER.info(" {}", personDAO.getJdbcConnection());

            LOGGER.info(" {}", personDAO2);
            LOGGER.info(" {}", personDAO2.getJdbcConnection());

        }
    }

}
