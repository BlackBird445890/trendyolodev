package com.selenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trendyol {
    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com");


        WebElement erKek = driver.findElement(new By.ByCssSelector("img[alt=\"Male\"] "));
        erKek.click();

        WebElement girisYap = driver.findElement(new By.ByCssSelector("div.link.account-user"));
        girisYap.click();


        WebElement ePosta = driver.findElement(By.id("login-email"));
        ePosta.sendKeys("tolga.karakus4458@gmail.com");
        ePosta.click();

        WebElement passWord = driver.findElement(By.id("login-password-input"));
        passWord.sendKeys("gs1905gs");
        passWord.click();

        //  WebElement girisYap2 = driver.findElement(new By.ByCssSelector(".class=[\"q-primary q-fluid q-button-medium q-button submit\"]"));
        //girisYap2.click();


        WebElement urunArama = driver.findElement(By.xpath("//input[@class=\"search-box\"]"));
        urunArama.sendKeys(" kazak " + Keys.ENTER);


        WebElement oNuncuKazak;
        oNuncuKazak = driver.findElement(By.xpath("//input@class=\"prdct-desc-cntnr-ttl-w two-line-text\"]"));
        oNuncuKazak.click();
    }
    }
