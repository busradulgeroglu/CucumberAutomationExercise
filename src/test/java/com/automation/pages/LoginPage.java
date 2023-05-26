package com.automation.pages;

import com.automation.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    HomePage homePage = new HomePage();
    @FindBy (xpath = "//input[@type='text']")
    public WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signUpMail;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpBtn;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement accountInformation;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement welcomeMessage;

    @FindBy (xpath = "//b[text()='sen2121']")
    public WebElement welcomeName;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement signUpText;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement signUpWarningText;


    public void signUp(String name, String email){
        homePage.signUpButton.click();
        signUpName.sendKeys(name);
        signUpMail.sendKeys(email);
        signUpBtn.click();
    }

    public void login(String email,String password){
       loginEmail.sendKeys(email);
       loginPassword.sendKeys(password);
       loginBtn.click();
    }

    public void verifyName(String welcomeUsername){
        String actualWelcomeMessageName = welcomeUsername;
        Assert.assertEquals(welcomeName.getText(),actualWelcomeMessageName);
    }

}
