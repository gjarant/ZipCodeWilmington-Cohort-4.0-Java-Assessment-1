package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sumThemAll = 0;

        for(int i = 0; i <= intArray.length; i++){
            sumThemAll += i;
        }
        return sumThemAll;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int productThemAll = 1;

        for(int i = 1; i <= intArray.length; i++){
            productThemAll *= i;
        }
        return productThemAll;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int getTotal = getSum(intArray);

        Double getAverageScore = (double)(getTotal/intArray.length);

        return getAverageScore;
    }
}
