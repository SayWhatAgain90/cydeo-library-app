package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BookManagementPage;
import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    BookManagementPage bookManagementPage = new BookManagementPage();

    UsersPage usersPage = new UsersPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {

        loginPage.usernameInput.sendKeys("librarian1@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordInput.sendKeys("qU9mrvur" + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void use_should_see_the_dashboard() {
        BrowserUtils.waitForVisibilityOf(dashboardPage.dashboard);
        Assert.assertTrue(dashboardPage.dashboard.isDisplayed());
    }


    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.usernameInput.sendKeys("student2@library");
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordInput.sendKeys("zyxa10vg" + Keys.ENTER);
    }

    @Then("books should be displayed")
    public void books_should_be_displayed() {
        BrowserUtils.waitForVisibilityOf(bookManagementPage.booksSection);
        Assert.assertTrue(bookManagementPage.booksSection.isDisplayed());
    }

    @When("user enter username {string}")
    public void user_enter_username(String username) {
        loginPage.usernameInput.sendKeys(username);
    }

    @When("user enter password {string}")
    public void user_enter_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }

    @When("user click the sign in button")
    public void user_click_the_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Then("there should {int} users")
    public void there_should_users(Integer int1) {
        Assert.assertTrue(parseInt(dashboardPage.usersCounter.getText()) == int1);
    }

    @When("user logs in with username {string} and password {string}")
    public void userLogsInWithUsernameAndPasswordZiwVOx(String username, String password) {
        loginPage.login(username, password);
    }


    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> columnNames) {
BrowserUtils.waitForVisibilityOf(usersPage.usersPageButton);
        Assert.assertEquals(columnNames, BrowserUtils.getElementsText(usersPage.columnHeaders));

    }


    @And("user clicks on {string} link")
    public void userClicksOnUsersLink(String link) {
        BrowserUtils.waitForVisibilityOf(usersPage.usersPageButton);
        switch (link.toLowerCase()) {
            case "dashboard":
                usersPage.dashboardButton.click();
                break;
            case "users":
                usersPage.usersPageButton.click();
                break;
            case "books":
                usersPage.booksButton.click();
                break;

        }
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String name) {
        BrowserUtils.waitForVisibilityOf(dashboardPage.accountHolderName);
        Assert.assertEquals(name, dashboardPage.accountHolderName.getText());
    }
}
