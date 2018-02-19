package com.zipcodewilmington.assessment1.part2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToRemove)) {
                count++;
            }

        }
        Integer[] removeArray = new Integer[objectArray.length - count];

        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                removeArray[element] = (Integer) objectArray[i];
                element++;

            }
        }
        return removeArray;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        Object temp;
        int counter = 1;
        int tCounter;
        for (int index = 0; index < (objectArray.length - 1); index++) {
            temp = objectArray[index];
            tCounter = 0;
            for (int indexTwo = 1; indexTwo < objectArray.length; indexTwo++) {
                if (temp == objectArray[indexTwo])
                    tCounter++;
            }
            if (tCounter > counter) {
                mostCommon = temp;
                counter = tCounter;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

        /**
         * @param objectArray      an array of any type of Object
         * @param objectArrayToAdd an array of Objects to add to the first argument
         * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
         * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
         */
        public static Integer[] mergeArrays (Integer[]objectArray, Integer[]objectArrayToAdd){
            Integer[] mergedArrays = new Integer[objectArray.length + objectArrayToAdd.length];
            int i = 0;
            for (Integer firstArray: objectArray)
            {
                mergedArrays[i] = firstArray;
                i++;
            }

            for (Integer  secondArray: objectArrayToAdd)
            {
                mergedArrays[i] = secondArray;
                i++;
            }

            return mergedArrays;
        }
    }

