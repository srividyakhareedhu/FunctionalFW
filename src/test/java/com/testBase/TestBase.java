package com.testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static Properties prop;
    public static FileInputStream fip;
    public static String Browser; 
    public static  WebDriver driver;
    public static SoftAssert st;
    public static Select select;
    public static int tc=0;
    
    @BeforeSuite
    public static void OpenBrowser() throws Throwable{
    	st=new SoftAssert();
        fip=new FileInputStream(".\\src\\test\\java\\com\\config\\OR.properties");
        prop=new Properties();
        prop.load(fip);
        
        Browser=prop.getProperty("Browser");
        if(Browser.equalsIgnoreCase("chrome")){
        	WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver(); // OpenBrowser
        }else if(Browser.equalsIgnoreCase("mozilla")){
        	WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
         driver.get("http://localhost:9000/login.do"); // open url
         driver.manage().window().maximize(); // Maximize browser window
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @AfterSuite
    public static void CloseBrowser(){
        driver.quit();
    }
        

}
