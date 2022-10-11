package com.talentslms.UI.helpers;

import com.talentslms.UI.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
    public Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;// this обращается к нашему объекту
    }

    public Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click (WebElement element){
        waitElementToBeDisplayed(element);//пока появится
        waitElementToBeClickable(element);// пока
        element.click();
        return this;

    }

    public Helper sendKeys(WebElement element, String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public String getText (WebElement element){
        return element.getText();

    }
}
