package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sumThemAll = 0;

        for(int i = 0; i < n; i++){
            sumThemAll += i;
        }
        return sumThemAll;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

    int productThemAll = 1;

        for(int i = 1; i <= n; i++){
        productThemAll *= i;
    }
        return productThemAll;
}
    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String integerTOString= Integer.toString(val);
        String reversedStringtoInt = "";
        for(int i = integerTOString.length()-1; i >= 0; i--) {
            reversedStringtoInt += integerTOString.charAt(i);
        }
        return Integer.parseInt(reversedStringtoInt);

    }
}
