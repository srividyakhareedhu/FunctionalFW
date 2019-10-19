package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test3 extends library{
	
	@Test
	public void testCase1() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewCustomer();
		createcustomer("CustomerC", "DescriptionC", "cradio3");
		verifysucessmsg();
		assertall();
	}
	

}
