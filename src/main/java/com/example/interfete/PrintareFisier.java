package com.example.interfete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintareFisier implements Printare {

  public void print(String s) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write(s);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void createFile(String fileName){
    try {
      File myObj = new File(fileName);
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
