package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class base_page {
    WebDriver driver;
    JavascriptExecutor jse;

    public base_page(WebDriver driver) {
        this.driver = driver;
    }
    public void waits_for_element(WebDriver driver, int time, By element){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void scroll_down(WebDriver driver){
        jse=(JavascriptExecutor) driver;
        jse.executeScript("scroll(0,250)");
    }
<<<<<<< HEAD
    public void check_element_is_appear_everyspcifictime(WebDriver driver, WebElement element){
=======
        public void check_element_is_appear_everyspcifictime(WebDriver driver, WebElement element){
>>>>>>> 747285cca9dde891135740eef4425e4b0a6b264d
        FluentWait wait=new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
