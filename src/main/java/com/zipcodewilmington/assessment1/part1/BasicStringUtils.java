package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String camelCaseRun = str.substring(0,1). toUpperCase()+ str.substring(1);
        return camelCaseRun;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);

        return reverseString.reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reverseString = reverse(str);

        String camelCaseRun = camelCase(reverseString);


        return camelCaseRun;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder upperAndLower = new StringBuilder(str);
        for(int i = 0; i < upperAndLower.length(); i++){
            char character = upperAndLower.charAt(i);

            if(Character.isUpperCase(character)){
                upperAndLower.setCharAt(i, Character.toLowerCase(character));
            }else {
                upperAndLower.setCharAt(i, Character.toUpperCase(character));
            }
        }

        return upperAndLower.toString();
    }
}
