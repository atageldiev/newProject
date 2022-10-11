package com.talentslms.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage{
    @FindBy(xpath = "//input[@id='246190056']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@id='320193912']")
    public WebElement lastNameInput;
    @FindBy(xpath = "//input[@id='1646834378']")
    public WebElement emailInput;
    @FindBy(xpath = "//input[@id='1309321146']")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@id='1630598423']")
    public WebElement passwordInput;
    @FindBy(xpath = "//textarea[@id='1511859914']")
    public WebElement bioInput;
    @FindBy(xpath = "//div[@id='s2id_675337719']")
    public WebElement userType;
    @FindBy(xpath = "select2-result-label")
    public WebElement userTypeSuperAdmin;
////    @FindBy(xpath = "")
//    public AddUserPage inputFirstName(String firstName){
//        helper.sendKeys(firstNameInput,firstName);
//    }



}
