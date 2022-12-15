package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class product_page extends base_page{
    public product_page(WebDriver driver) {
        super(driver);
    }
    private By add_review=By.linkText("Add your review");
    private By product_count=By.id("product_enteredQuantity_5");
    private By add_cart=By.className("add-to-cart-button");
    private By add_wishlist=By.className("add-to-wishlist-button");
    private By add_compare_list=By.className("add-to-compare-list-button");
    private By email_freinds=By.className("email-a-friend-button");

    public void click_add_review(){
        waits_for_element(driver,20,add_review);
        driver.findElement(add_review).click();
    }
    public void add_count_product(String count){
        waits_for_element(driver,20,product_count);
        driver.findElement(product_count).sendKeys(count);
    }
    public void click_add_cart(){
        waits_for_element(driver,20,add_cart);
        driver.findElement(add_cart).click();
    }
    public void click_add_wishlist(){
        waits_for_element(driver,20,add_wishlist);
        driver.findElement(add_wishlist).click();
    }
    public void click_add_comparelist(){
        waits_for_element(driver,20,add_compare_list);
        driver.findElement(add_compare_list).click();
    }
    public void click_email_freinds(){
        waits_for_element(driver,20,email_freinds);
        driver.findElement(email_freinds).click();
    }


}
