package com.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTester {

  public static void testLogin(WebDriver driver) throws InterruptedException {
    driver.get("http://rahulshettyacademy.com/locatorspractice");
    driver.findElement(By.id("inputUsername")).sendKeys("oana");
    driver.findElement(By.name("inputPassword")).sendKeys("blabla");
    driver.findElement(By.className("signInBtn")).click();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//implicit wait - 5seconds time

    System.out.println( driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > p")).getText());


    driver.findElement(By.linkText("Forgot your password?")).click();

    Thread.sleep(5000);

    driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("mhm");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("a@b.com");
    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("c@d.com");
    driver.findElement(By.xpath("//form/input[3]")).sendKeys("3874297432");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    driver.findElement(By.id("chkboxOne")).click();
    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    //    driver.quit();
  }

}
