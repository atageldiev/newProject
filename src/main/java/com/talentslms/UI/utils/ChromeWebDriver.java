package com.talentslms.UI.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromiumdriver().setup();
        ChromeOptions options = new ChromeOptions();//передаем настройки
        options.addArguments("--start-maximized");//даем определенные команды
        options.addArguments("--disable-extensions");//отключай какие то расширения
        options.addArguments("--window-size=1920,1080");//даем формат экрана



        WebDriver driver = new ChromeDriver(options);// настройки доступны в драйвере
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;

    }
}
