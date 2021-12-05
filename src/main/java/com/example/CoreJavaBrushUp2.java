package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaBrushUp2 {

  public static void exemplu() {

//    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 2123};
//
//    for (int i = 0; i < arr2.length; i++) {
//      if (arr2[i] % 2 == 0) {
//        System.out.println(arr2[i]);
//      }
//      else {
//        System.out.println(arr2[i]+"+is not multiple of 2");
//      }
//    }
//
//    ArrayList<String> a = new ArrayList<>();
//    a.add("rahul");
//    a.add("shetty");
//    a.add("Academy");
//    a.remove(2);
//    System.out.println(a.get(1));
//
//    create object of the class - object.method
//
//
//    string is an object // string literal
    String s1 = "rahul shetty academy";
    String s5 = "Hello";

//    new
    String s2 = new String("Welcome");
    String s3 = new String("Welcome");

    String s = "rahul shetty academy";
    String s22 = "rahul shetty academy";
    String[] splittedString = s.split("shetty");
    System.out.println(splittedString[0]);
    System.out.println(splittedString[1]);
//    System.out.println(splittedString[2]);
//    System.out.println(s22[0]); //s22 is a string, not an array
    System.out.println(splittedString[1].trim());



  for(int i = s.length()-1;i>=0;i--){
    System.out.println(s.charAt(i));
  }





  }

}
