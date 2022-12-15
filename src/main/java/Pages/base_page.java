package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
