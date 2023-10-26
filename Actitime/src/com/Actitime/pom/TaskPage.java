package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	//declaration
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerdesp;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustbtn;
	
	//Initialization
	
	public TaskPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	//utilization

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCustomerdesp() {
		return customerdesp;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}
	
	
	
	
	
	

}
