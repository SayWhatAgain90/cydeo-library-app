package com.cydeo.library.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {
    // Methods are static because we do not want to create an object to call these methods

    /**
     * this method is used to pause the code for given seconds
     * it is a static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param seconds
     */


    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("exception happened in sleep method!");
        }

    }

    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }
    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public static void waitForVisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void verifyContainTitle(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    /**
     * This method will accept dropdown as a WebElemnt
     * and return all the options text in a List of String
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);

        //List of all ACTUAL month <options> as a WebElement
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all ACTUAL month options as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        // with using for loop we will convert each WebElement of options to String with using getText() method
        // with using add() method we will add each String option in List<String> actual options as String
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;

    }

    /**
     * This method will accept a group of radio buttons as a List<WebElement>
     * it will loop through the List and click the radio button with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        for(WebElement each : radioButtons){
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }
    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

}
