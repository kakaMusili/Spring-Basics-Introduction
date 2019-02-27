package com.in28minutes.spring.springin5steps.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImp {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Qualifier("quickSortAlgorithm")
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int num) {
        //sorting logic
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = this.sortAlgorithm.sort(numbers);

       // System.out.println(" algorithm used is  === " + this.sortAlgorithm);


        //search logic
        //return results
        return 3;



    }

    @PostConstruct
    public void postConstruct()
    {
       logger.info("Post construct method created");
    }

    @PreDestroy
    public void preDestroy()
    {
        logger.info("Pre destroy");
    }
}
