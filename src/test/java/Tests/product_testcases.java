package Tests;

import Pages.home_page;
import Pages.product_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class product_testcases {
    private WebDriver driver;
    home_page hp;
    product_page pp;
    @Test(dependsOnGroups = "search",groups = "product")
    public void valid_product_test(){
        driver=base_test.getDriver();
        pp=new product_page(driver);
        pp.add_count_product("2");
        pp.click_add_cart();

    }
}
