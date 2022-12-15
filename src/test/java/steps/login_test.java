package steps;

import Pages.home_page;
import Pages.login_page;
import Tests.base_test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class login_test {
    WebDriver driver;
    home_page hp;
    login_page lp;
    @Given("go login page")
    public void goLoginPage(){
        driver= base_test.getDriver();
        hp=new home_page(driver);
        hp.click_login_page();
    }

    @When("user add email {string} password {string}")
    public void userAddEmailPassword(String email, String password) {
        driver= base_test.getDriver();
        lp=new login_page(driver);
        lp.setEmail(email);
        lp.setPassword(password);
    }

    @And("user click login")
    public void userClickLogin() {
        driver= base_test.getDriver();
        lp=new login_page(driver);
        lp.click_login();
    }

    @Then("assert unsuccessful login")
    public void assertUnsuccessfulLogin() {
        driver= base_test.getDriver();
        lp=new login_page(driver);
        String errormessage= lp.error_messages();
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",errormessage);
    }
}
