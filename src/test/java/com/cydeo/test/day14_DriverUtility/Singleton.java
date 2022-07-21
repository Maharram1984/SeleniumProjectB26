package com.cydeo.test.day14_DriverUtility;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if(word==null){
            System.out.println("First time call.Word is null.Assigning value to it now");
            word = "something";
        }else {
            System.out.println("Word already has a value");
        }
        return word;
    }













}
