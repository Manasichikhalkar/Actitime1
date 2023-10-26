package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplemention;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

@Listeners(ListenerImplemention.class)

public class CreateCustomer extends BaseClass {
	
	@Test
	public void create() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasklnk().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcustomer().click();
		FileLibrary f=new FileLibrary();
		String custname = f.readDatafromExcel("Sheet1", 2, 2);
		String custdesp = f.readDatafromExcel("Sheet1", 1, 2);
		tp.getCustomername().sendKeys(custname);
		tp.getCustomerdesp().sendKeys(custdesp);
		tp.getCreatecustbtn().click();
		String expecteddata = custname ;
		String actualdata = driver.findElement(By.xpath("(//div[.='"+custname+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(expecteddata, actualdata);
		s.assertAll();
		
		
		}
	
	

}
