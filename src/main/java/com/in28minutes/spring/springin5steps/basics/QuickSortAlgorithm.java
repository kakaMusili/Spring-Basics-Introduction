package com.in28minutes.spring.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quickSortAlgorithm")
public class QuickSortAlgorithm implements  SortAlgorithm{
    public  int[] sort(int[] numbers)
    {
        //sort-logic
        for(int i=0;i<numbers.length;i++)
        {
            int  temp;
            for(int j=i+1;j<numbers.length-1;j++)
            {
                if(numbers[j]<numbers[i]){
                    temp =numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }

            }
        }
        printArray(numbers);
        return numbers;
    }

    @Override
    public void printArray(int[] arrayNumbers) {
        if (arrayNumbers.length==0)
        {
            System.out.print( "empty array ");

        }else
        {
            for(int i=0;i<arrayNumbers.length;i++){

                System.out.print( "," + arrayNumbers[i]);
            }

        }
    }
}
