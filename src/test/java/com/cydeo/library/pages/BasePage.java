package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Users']")
    public WebElement usersPageButton;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksButton;


    @FindBy (xpath = "//a[@class='nav-link dropdown-toggle']/span")
    public WebElement accountHolderName;
}
