package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test2 extends library{
	
	@Test
	public void testCase1() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewCustomer();
		createcustomer("CustomerB", "DescriptionB", "cradio2");
		verifysucessmsg();
		assertall();
	}
	

}
