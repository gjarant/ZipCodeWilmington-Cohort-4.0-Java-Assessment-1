package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        String oddNumbers = "";

        for(int i = 0; i < ints.length; i++){

            if (ints[i] % 2 != 0){
                oddNumbers += ints[i] + " ";
            }
        }

        String[] tempStringArray = oddNumbers.split( " ");
        Integer[] integerArray = new Integer[tempStringArray.length];

        for(int i = 0; i < tempStringArray.length; i++) {
            integerArray[i] = Integer.parseInt(tempStringArray[i]);
        }


        return integerArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        String evenNumbers = "";

        for(int i = 0; i < ints.length; i++){

            if (ints[i] % 2 == 0){
                evenNumbers += ints[i] + " ";
            }
        }

        String[] tempStringArray = evenNumbers.split( " ");
        Integer[] integerArray = new Integer[tempStringArray.length];

        for(int i = 0; i < tempStringArray.length; i++) {
            integerArray[i] = Integer.parseInt(tempStringArray[i]);
        }


        return integerArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        String notMultipleOfThree = "";

        for(int i = 0; i < ints.length; i++){

            if (ints[i] % 3 != 0){
                notMultipleOfThree += ints[i] + " ";
            }
        }

        String[] tempStringArray = notMultipleOfThree.split( " ");
        Integer[] integerArray = new Integer[tempStringArray.length];

        for(int i = 0; i < tempStringArray.length; i++) {
            integerArray[i] = Integer.parseInt(tempStringArray[i]);
        }


        return integerArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        String notMultipleOfMultiple= "";

        for(int i = 0; i < ints.length; i++){

            if (ints[i] % multiple != 0){
                notMultipleOfMultiple += ints[i] + " ";
            }
        }

        String[] tempStringArray = notMultipleOfMultiple.split( " ");
        Integer[] integerArray = new Integer[tempStringArray.length];

        for(int i = 0; i < tempStringArray.length; i++) {
            integerArray[i] = Integer.parseInt(tempStringArray[i]);
        }


        return integerArray;

    }
}
