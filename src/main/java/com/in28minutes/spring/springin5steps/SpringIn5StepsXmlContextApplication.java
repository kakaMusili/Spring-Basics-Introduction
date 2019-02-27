package com.in28minutes.spring.springin5steps;

import com.in28minutes.spring.springin5steps.basics.BinarySearchImp;
import com.in28minutes.spring.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/


public class SpringIn5StepsXmlContextApplication {

    private static Logger logger=LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

    public static void main(String[] args) {
        try
                (ClassPathXmlApplicationContext applicationContext =
                         new ClassPathXmlApplicationContext("applicationContext.xml")) {

            logger.info("Beans Loaded -- {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
            BinarySearchImp binarySearchImp=applicationContext.getBean(BinarySearchImp.class);

            logger.info("{}", personDAO);
            logger.info("{}", personDAO.getXmlJdbcConnectionn());

            logger.info("{}", binarySearchImp);
            logger.info("{}", binarySearchImp.binarySearch( new int[]{10,5,6,8,7,3,1,0},6));


        }
    }

}
