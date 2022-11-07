package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookManagementPage extends BasePage{
    public BookManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "books")
    public WebElement booksSection;
}
