package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class home_page extends base_page{
    public home_page(WebDriver driver) {
        super(driver);
    }
    Select select;
    private By register= By.linkText("Register");
    private By login= By.linkText("Log in");
    private By logout= By.linkText("Log out");
    private By search_input=By.name("q");
    private By search_bar=By.xpath("//*[@id=\"ui-id-2\"]");
    private By go_cart=By.linkText("Shopping cart");

    public void click_register_page(){
        waits_for_element(driver,20,register);
        driver.findElement(register).click();

    }
    public void click_login_page(){
        waits_for_element(driver,20,login);
        driver.findElement(login).click();

    }
    public void click_logout(){
        waits_for_element(driver,20,logout);
        driver.findElement(logout).click();
    }
    public void search_text(String searchs){
        waits_for_element(driver,20,search_input);
        driver.findElement(search_input).sendKeys(searchs);
    }
    public void choose_search_text(){
       waits_for_element(driver,20,search_bar);
       driver.findElement(search_bar).click();


    }
    public void go_cart(){
           waits_for_element(driver,20,go_cart);
           driver.findElement(go_cart).click();


        }

}
