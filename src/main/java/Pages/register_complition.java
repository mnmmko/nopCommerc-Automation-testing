package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register_complition extends base_page{

    public register_complition(WebDriver driver) {
        super(driver);
    }
    private By register_check=By.className("result");
    private By continue_button=By.className("register-continue-button");

    public String get_registercheck(){
        waits_for_element(driver,20,register_check);
        return driver.findElement(register_check).getText();
    }
    public void click_continue(){
        waits_for_element(driver,20,continue_button);
        driver.findElement(continue_button).click();
    }
}
