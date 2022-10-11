package com.talentslms.UI.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminHomePage extends BasePage{



    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement  adminHomeTitle;

    @FindBy(xpath = "//a[@href='https://atageldiev.talentlms.com/user/create'][1]")
    public WebElement addUserButton;

}
