package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class register_page extends base_page{
    public register_page(WebDriver driver) {
        super(driver);
    }
    private By gender_male= By.id("gender-male");
    private By gender_female= By.id("gender-female");
    private By firsname=By.id("FirstName");
    private By lastnames=By.id("LastName");
    private By day=By.name("DateOfBirthDay");
    private By month=By.name("DateOfBirthMonth");
    private By year=By.name("DateOfBirthYear");
    private By email=By.id("Email");
    private By company=By.id("Company");
    private By newsletter=By.id("Newsletter");
    private By password=By.id("Password");
    private By confirm_password=By.id("ConfirmPassword");
    private By register=By.id("register-button");
    private By exist_email=By.className("message-error");

    public void gender(String gender){
        if(gender.equals("male")) {
            waits_for_element(driver,20,gender_male);
            driver.findElement(gender_male).click();
        }else {
            waits_for_element(driver,20,gender_female);
            driver.findElement(gender_female).click();
        }
    }
    public void setFirstname(String firstname){
        waits_for_element(driver,20,firsname);
           driver.findElement(firsname).sendKeys(firstname);
    }
    public void setLastname(String lastname){
        waits_for_element(driver,20,lastnames);
           driver.findElement(lastnames).sendKeys(lastname);
    }
    public void select_day(String days){
        waits_for_element(driver,20,day);
        Select day_select=new Select(driver.findElement(day));
        day_select.selectByVisibleText(days);
    }
    public void select_month(String months){
        waits_for_element(driver,20,month);
        Select month_select=new Select(driver.findElement(month));
        month_select.selectByVisibleText(months);
    }
    public void select_year(String years){
        waits_for_element(driver,20,year);
        Select year_select=new Select(driver.findElement(year));
        year_select.selectByVisibleText(years);
    }
    public void setemail(String emails){
        waits_for_element(driver,20,email);
        driver.findElement(email).sendKeys(emails);
    }
    public void setCompany(String Companys){
        waits_for_element(driver,20,company);
        driver.findElement(company).sendKeys(Companys);
    }
    public void check_Newsletter(){
        waits_for_element(driver,20,newsletter);
        driver.findElement(newsletter).click();
    }
    public void setpassword(String passwords){
        waits_for_element(driver,20,password);
        driver.findElement(password).sendKeys(passwords);
    }
    public void setconfirm_password(String confirm_passwords){
        waits_for_element(driver,20,confirm_password);
        driver.findElement(confirm_password).sendKeys(confirm_passwords);
    }
    public void click_register(){
        waits_for_element(driver,20,register);
        driver.findElement(register).click();
    }
    public String get_exists_email(){
        waits_for_element(driver,20,exist_email);
        return driver.findElement(exist_email).getText();
    }
}
