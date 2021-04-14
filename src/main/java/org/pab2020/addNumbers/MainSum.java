package org.pab2020.addNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainSum {
    public static void main(String[] arg){
        final int CAPACITY = 10000;
        List<Double> listOfNumbers = new ArrayList<>(CAPACITY);

        //Step 1. Inicialize the of numbers
        Random randomNumberGenerator = new Random(5);
        for (int i = 0; i<CAPACITY; i++){
            listOfNumbers.add((double)randomNumberGenerator.nextInt(500));
        }

        //Step 2. Create the Delay
        Delay delay = new Delay(7000);

        //Step 3. Sum the numbers
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();

        long initTime = System.currentTimeMillis();
        double sum = 0.0;

        for(double value: listOfNumbers){
            sum = sumTwoNumbers.sum(sum, value, delay);
        }
        long computingTime = System.currentTimeMillis() - initTime;

        System.out.println("Computing Time: " + computingTime);
        System.out.println("Sum: " + sum);
    }
}