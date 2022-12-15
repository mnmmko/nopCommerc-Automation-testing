package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utilitries.screenshot.screenshot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class base_test {
    private static WebDriver driver;
    private static Properties prop;
    public static WebDriver getDriver(){
        return driver;
    }
    public static Properties getProperties(){
        return prop;
    }
    @BeforeSuite
    @Parameters({"browser"})
    public void open(String browser) throws IOException {
        prop=new Properties();
        prop.load(new FileInputStream("src/main/java/properties/properties.properties"));
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to(prop.getProperty("Base_url"));
        }
        else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to(prop.getProperty("Base_url"));
        }
    }

    @AfterSuite
    public void close(){
        driver.quit();
    }

    @AfterMethod
    public void failed_screenshots(ITestResult testcase_Result) throws IOException {
        if (testcase_Result.getStatus() == ITestResult.FAILURE) {
            screenshot.take_screenshot(driver, ".\\screenshots\\" + testcase_Result.getName() + ".png");
            System.out.println("itestresult.failure is " + ITestResult.FAILURE);
            System.out.println("testcase_Result.getStatus() " + testcase_Result.getStatus());
        }
    }
}
