package com.in28minutes.spring.springin5steps;

import com.in28minutes.spring.springin5steps.basics.BinarySearchImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/

@Configuration
@ComponentScan
public class SpringIn5StepsBasicsApplication {

    public static void main(String[] args) {
        try
                (AnnotationConfigApplicationContext applicationContext =
                         new AnnotationConfigApplicationContext(SpringIn5StepsBasicsApplication.class)) {

            BinarySearchImp binarySearchImp = applicationContext.getBean(BinarySearchImp.class);
            BinarySearchImp binarySearchImp1 = applicationContext.getBean(BinarySearchImp.class);

            //BinarySearchImp binarySearchImp = new BinarySearchImp(new QuickSortAlgorithm());
            /*System.out.println(binarySearchImp);*/
            /*System.out.println(binarySearchImp1);*/
            System.out.println("algorithm used is - " + binarySearchImp.getSortAlgorithm());

            int resultSet = binarySearchImp.binarySearch(new int[]{2, 3, 1, 4, 6, 8, 7, 10, 25, 28, 0, 123}, 3);

            System.out.println("value is - " + resultSet);
            binarySearchImp.preDestroy();
        }
    }

}
