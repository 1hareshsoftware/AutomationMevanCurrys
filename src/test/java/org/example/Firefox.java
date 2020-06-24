package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Firefox {

    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Soft\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.currys.co.uk/gbuk/index.html");

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();
    }


}
