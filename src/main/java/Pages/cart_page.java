package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class cart_page extends base_page{
    public cart_page(WebDriver driver) {
        super(driver);
    }
 private By qty=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[5]/input");
 private By remove_item=By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[7]/button");
 private By update_cart=By.className("update-cart-button");
 private By continue_shopping=By.className("continue-shopping-button");
 private By estimate_shopping=By.linkText("Estimate shipping");
 private By gift=By.id("checkout_attribute_1");
 private By disc_code=By.id("discountcouponcode");
 private By gift_card=By.id("giftcardcouponcode");
 private By apply_cupon=By.id("applydiscountcouponcode");
 private By apply_gift=By.id("applygiftcardcouponcode");
 private By agree=By.id("termsofservice");
 private By checkout=By.id("checkout");
 private Select select;

 public void quantity(String qtys){
    waits_for_element(driver,20,qty);
    driver.findElement(qty).sendKeys(qtys);
 }
 public void click_remove(){
     waits_for_element(driver,20,remove_item);
     driver.findElement(remove_item).click();
 }
 public void click_update_cart(){
     waits_for_element(driver,20,update_cart);
     driver.findElement(update_cart).click();
 }
 public void click_continue_shopping(){
     waits_for_element(driver,20,continue_shopping);
     driver.findElement(continue_shopping).click();
 }
 public void click_estimate_shopping(){
     waits_for_element(driver,20,estimate_shopping);
     driver.findElement(estimate_shopping).click();
 }
 public void choose_gift(String gifts){
     waits_for_element(driver,20,gift);
     select=new Select(driver.findElement(gift));
     select.selectByVisibleText(gifts);
 }
    public void add_disc_Code(String dic_code){
        waits_for_element(driver,20,disc_code);
        driver.findElement(disc_code).sendKeys(dic_code);
    }
    public void add_gift_card(String card){
        waits_for_element(driver,20,gift_card);
        driver.findElement(gift_card).sendKeys(card);
    }
    public void click_apply_cupon(){
        waits_for_element(driver,20,apply_cupon);
        driver.findElement(apply_cupon).click();
    }
    public void click_apply_gift(){
        waits_for_element(driver,20,apply_gift);
        driver.findElement(apply_gift).click();
    }
    public void click_agree(){
        waits_for_element(driver,20,agree);
        driver.findElement(agree).click();
    }
    public void click_checkout(){
        waits_for_element(driver,20,checkout);
        driver.findElement(checkout).click();
    }
}
