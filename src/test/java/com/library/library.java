package com.library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.testBase.TestBase;

public class library extends TestBase{

	public static void login()
	{
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("admin");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("manager");
		driver.findElement(By.xpath(prop.getProperty("loginnow"))).click();
	}
	
	public static void selectCustomer(String cname)
	{
		WebElement soc=driver.findElement(By.xpath(prop.getProperty("selectcustomer")));
		select=new Select(soc);
		select.selectByVisibleText(cname);
	}
	public static void clickOnTask()
	{
		driver.findElement(By.xpath(prop.getProperty("task"))).click();
	}
	
	public static void clickOnProAndCustomer()
	{
		driver.findElement(By.xpath(prop.getProperty("proandcustomer"))).click();
	}
	
	public static void clickOnCreateNewCustomer()
	{
		driver.findElement(By.xpath(prop.getProperty("createnewcustomer"))).click();
	}
	
	public static void clickOnCreateNewProject()
	{
		driver.findElement(By.xpath(prop.getProperty("createnewproject"))).click();
	}
	
	public static void createcustomer(String cname,String cdesc,String cradio){
        driver.findElement(By.xpath(prop.getProperty("Entercustomer"))).sendKeys(cname);
        driver.findElement(By.xpath(prop.getProperty("Entercustomerdescription"))).sendKeys(cdesc);
        driver.findElement(By.xpath(prop.getProperty(cradio))).click();
        driver.findElement(By.xpath(prop.getProperty("createcustomer"))).click();
    }
	
	public static void createProject(String cname, String pname, String pdesc, String pradio1)
	{
		selectCustomer(cname);
		driver.findElement(By.xpath(prop.getProperty("Enterproject"))).sendKeys(pname);
        driver.findElement(By.xpath(prop.getProperty("Enterprojectdescription"))).sendKeys(pdesc);
        driver.findElement(By.xpath(prop.getProperty(pradio1))).click();
        driver.findElement(By.xpath(prop.getProperty("createproject"))).click();
	}
	
	public static void verifysucessmsg() throws Throwable{
        try
        {
            driver.findElement(By.xpath(prop.getProperty("sucessmsg"))).isDisplayed();
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(srcFile, new File(".\\src\\test\\java\\com\\screenshot\\Test"+(tc=tc+1)+"_Pass.png"));
            driver.findElement(By.xpath(prop.getProperty("logout"))).click();
            
        }
        catch(Throwable t)
        {
                File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(srcFile, new File(".\\src\\test\\java\\com\\screenshot\\Test"+(tc=tc+1)+"_Fail.png"));
                st.fail("Sucessmsg does not displayed...");
                driver.findElement(By.xpath(prop.getProperty("logout"))).click(); //logout
                driver.findElement(By.xpath(prop.getProperty("cancelcustomercraeation"))).click();//cancel customer creation
                
        }
   }
   
   public static void assertall(){
       st.assertAll();
   }
	
}
