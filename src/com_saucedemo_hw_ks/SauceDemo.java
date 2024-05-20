package com_saucedemo_hw_ks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Project-4 - ProjectName : com-saucedemo
BaseUrl = https://www.saucedemo.com/
1. Setup chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current url.
5. Print the page source.
6. Enter the email to email field.
7. Enter the password to password field.
8. Click on Login Button.
9. Print the current url.
10. Navigate to baseUrl
11. Refresh the page.
12. Close the browser.
 */
public class SauceDemo {

    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {


        //1. Setup Chrome browser.
        ChromeDriver driver = new ChromeDriver();
        // 2. Open URL.
        driver.get(baseUrl);
        //3. Print the title of the page.
        System.out.println("The title of the page: " + driver.getTitle());
        //4. Print the current url.
        System.out.println("The current url: " + driver.getCurrentUrl());
        //5. Print the page source.
        System.out.println("The page source: " + driver.getPageSource());
        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("xyz@gmail.com");
        //7. Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("xyz123");
        //8. Click on Login Button.
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        //9. Print the current url.
        System.out.println("The current url: " + driver.getCurrentUrl());
        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);
        //11. Refresh the page.
        driver.navigate().refresh();
        //12. Close the browser.
        driver.quit();

    }
}
