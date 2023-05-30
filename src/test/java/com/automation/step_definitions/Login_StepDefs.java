package com.automation.step_definitions;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user navigate to login page")
    public void the_user_navigate_to_login_page() {
        homePage.signUpButton.click();
    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedText) {
        String actualText = loginPage.loginText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String emailAdress, String password) {
      loginPage.login(emailAdress,password);
    }
    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String expectedWelcomeMessageName) {
       loginPage.verifyName(expectedWelcomeMessageName);
    }

    @When("The user enters incorrect {string} and {string}")
    public void the_user_enters_incorrect_and(String emailAdress, String password) {
        loginPage.login(emailAdress,password);
    }
    @Then("The user should be able to see warning message {string}")
    public void the_user_should_be_able_to_see_warning_message(String expectedWarningMessage) {
        String actualWarningMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
    }

}
