package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page extends base_page{
    public login_page(WebDriver driver) {
        super(driver);
    }
    private By email= By.id("Email");
    private By password =By.id("Password");
    private By rember_me =By.id("RememberMe");
    private By forget_password =By.linkText("Forgot password?");
    private By login=By.className("login-button");
    private By register=By.className("register-button");
    private By error_message=By.className("message-error");

    public void setEmail(String emails){
        waits_for_element(driver,20,email);
        driver.findElement(email).sendKeys(emails);
    }
    public void setPassword(String paswords){
        waits_for_element(driver,20,password);
        driver.findElement(password).sendKeys(paswords);
    }
    public void click_remember_me(){
        waits_for_element(driver,20,rember_me);
        driver.findElement(rember_me).click();
    }
    public void click_forget_password(){
        waits_for_element(driver,20,forget_password);
        driver.findElement(forget_password).click();
    }
    public void click_register(){
        waits_for_element(driver,20,register);
        driver.findElement(register).click();
    }
    public void click_login(){
        waits_for_element(driver,20,login);
        driver.findElement(login).click();
    }
    public String error_messages(){
        waits_for_element(driver,20,error_message);
        return driver.findElement(error_message).getText();
    }
}
