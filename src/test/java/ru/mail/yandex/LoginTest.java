package ru.mail.yandex;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class LoginTest {

    public ChromeDriver driver;

    @Before
    public void init() {
        driver = new ChromeDriver();
        System.out.println("test start");
        driver.get("https://yandex.ru/");
    }

    @Test
    public void loginTest() {
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

    }

    @Test
    public void loginTest2() {
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

    }

    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }
}
