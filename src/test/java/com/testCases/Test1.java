package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test1 extends library{
	
	@Test
	public void testCase1() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewCustomer();
		createcustomer("CustomerA", "DescriptionA", "cradio1");
		verifysucessmsg();
		assertall();
	}
	

}
