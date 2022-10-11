package com.talentslms.UI.pages;

import com.talentslms.UI.helpers.Helper;
import com.talentslms.UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);// инициализация наших элементов, иначе они не будут работат
    }

    Helper helper = new Helper();
}
