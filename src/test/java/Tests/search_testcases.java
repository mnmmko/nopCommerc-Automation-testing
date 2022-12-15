package Tests;

import Pages.home_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class search_testcases {
    private WebDriver driver;
    home_page hp;
    @Test(groups = "search")
    public void valid_search_test(){
      driver=base_test.getDriver();
      hp=new home_page(driver);
      hp.search_text("lap");
      hp.choose_search_text();

    }
}
