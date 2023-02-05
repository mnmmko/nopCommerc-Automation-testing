package Tests;

import Pages.home_page;
import Pages.register_complition;
import Pages.register_page;
import utilitries.excel.Read_excel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class register_testcases {
    WebDriver driver;
    register_page rp;
    register_complition rc;
    home_page hp;
    @Test(dataProvider = "data")
    public void test_valid_register(String gender,String firsname,String lastname,String day,String month,String year,String email,String company,String password,String confirm_password){
        driver=base_test.getDriver();
        hp=new home_page(driver);
        hp.click_register_page();

        rp=new register_page(driver);
        rp.gender(gender);
        rp.setFirstname(firsname);
        rp.setLastname(lastname);
        rp.select_day(day.replace(".0",""));
        rp.select_month(month);
        rp.select_year(year.replace(".0",""));
        rp.scroll_down(driver);
        rp.setemail(random_email());
        rp.setCompany(company);
        rp.setpassword(password);
        rp.setconfirm_password(confirm_password);
        rp.click_register();

        rc=new register_complition(driver);
        String check_register=rc.get_registercheck();
        Assert.assertEquals("Your registration completed",check_register);
        rc.click_continue();

    }
    @Test(dependsOnMethods = "test_valid_register",alwaysRun = true)
    public void test_invalid_register(){
        driver=base_test.getDriver();
        hp=new home_page(driver);
        hp.click_register_page();

        rp=new register_page(driver);
        rp.gender("male");
        rp.setFirstname("ali");
        rp.setLastname("amr");
        rp.select_day("5");
        rp.select_month("July");
        rp.select_year("1999");
        rp.scroll_down(driver);
        rp.setemail("m@gmail.com");
        rp.setCompany("c05");
        rp.setpassword("12345678");
        rp.setconfirm_password("12345678");
        rp.click_register();
        String text_exist_email=rp.get_exists_email();
        Assert.assertEquals("The specified email already exists",text_exist_email);

    }
    @DataProvider
    public Object[][] data() throws IOException, InvalidFormatException {
        return new Read_excel().read_sheet();
}

    protected String random_email(){
          String pattern="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghojklmnopqrstuvexyz1234567890";
        Random random=new Random();
        StringBuilder rand_email=new StringBuilder();
        while (rand_email.length()<10){
            int index=(int)(random.nextFloat()*pattern.length());
            rand_email.append(pattern.charAt(index));
        }
        String email=rand_email.toString();
        return email+"@gmail.com";
    }
}
