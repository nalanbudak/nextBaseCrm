package com.nextBaseCRM.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class loginToApp {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk41@cybertekschool.com" );
        Thread.sleep(1000);
        driver.findElement(By.id("USER_REMEMBER")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.className("user-block")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("user-block")).click();


// deneme




      /*  driver.navigate().back();
        driver.get("https://login2.nextbasecrm.com");


        /*

        driver.findElement(By.className("login-link-forgot-pass")).click();
        Thread.sleep(5000);
       driver.close();*/




    }
}
