package Tests;

import Pages.cart_page;
import Pages.home_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class cart_testcases {
    WebDriver driver;
    home_page hp;
    cart_page cp;
    @Test(dependsOnGroups = "product")
    public void valid_cart_test(){
        driver=base_test.getDriver();
        hp=new home_page(driver);
        hp.go_cart();
        cp=new cart_page(driver);
        cp.quantity("3");
        cp.choose_gift("Yes [+$10.00]");
        cp.click_agree();
        cp.click_checkout();
    }
}
