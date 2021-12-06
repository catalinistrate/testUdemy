package com.example;

import static com.example.CoreJavaBrushUp2.exemplu;

import com.example.interfete.MethodsT;
import com.example.interfete.PrintareFisier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

  public static void main(String[] args) throws InterruptedException {
//    PrintareFisier printare = new PrintareFisier();
//
//    printare.print("dsjah");

//    Chrome
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    WebDriver driver = new ChromeDriver();

//    Firefox
//    System.setProperty("webdriver.gecko.driver", "C:\\Users\\catalin.istrate\\Desktop\\geckodriver.exe");
//    WebDriver driver1 = new FirefoxDriver();

//    Microsoft Edge (trebuie driver pt versiunea 96)
//    System.setProperty("webdriver.edge.driver", "C:\\Users\\catalin.istrate\\Desktop\\msedgedriver.exe");
//    WebDriver driver2 = new EdgeDriver();

//    driver.get("https://rahulshettyacademy.com");
//    System.out.println(driver.getTitle());
//    ;
//    System.out.println(driver.getCurrentUrl());
//    driver.close(); // closes only the current tab

    // driver.quit(); closes all the windows/quit the driver

//  CoreJavaBrushUp1.exemplu();


//    CoreJavaBrushUp2.exemplu();

//    MethodsT d1 = new MethodsT();
//    d1.getData()
//
//
//    driver.get("http://google.com"); //hit url on the browser
//    System.out.println(driver.getTitle()); //validate if your page title is correct
//    Thread.sleep(3000);
//    driver.findElement(By.id("L2AGLb")).click();
//    Thread.sleep(3000);
//
//
//    System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
//    System.out.println(driver.getPageSource());//prints page source
//
//    driver.get("http://yahoo.com");
//    Thread.sleep(3000);
//    driver.navigate().back();
//    Thread.sleep(2000);
//    driver.navigate().forward();
//    driver.quit();
//

      driver.get("http://facebook.com");
      Thread.sleep(5000);
      WebElement cookie_button= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
      cookie_button.click();
      driver.findElement(By.id("email")).sendKeys("This is blabla");




  }

//public static String getData3(){
//  System.out.println("Hello world");
//  return "oana";
//}

}
