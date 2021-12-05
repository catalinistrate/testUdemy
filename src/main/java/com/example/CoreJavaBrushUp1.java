package com.example;

import java.util.ArrayList;
import java.util.List;

public class CoreJavaBrushUp1 {
public static void exemplu() {

  int myNum = 5; //primitive data type
  // string is non primitive data type
  String Website = "Rahul Sehtty Academy";
  char letter = 'r';
  double dec = 5.99;
  boolean myCard = true;

  System.out.println(myNum + " is the value stored in the myNum variable");
  System.out.println(Website);

  //arrays
  int[] arr = new int[5];
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 5;
  arr[4] = 7;

  int[] arr2 = {1, 2, 3, 4, 51};

  System.out.println(arr[0]);

//for loop
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }

  for(int i = 0; i<arr2.length;i++){
    System.out.println(arr2[i]);
  }

//  string array
  String[] name = {"Rhaul","Shetty","selenium"};

  for(int i = 0; i<name.length;i++){
    System.out.println(name[i]);
  }

  for(String s: name){
    System.out.println(s);
  }


}
}
