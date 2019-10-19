package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test6 extends library{
	
	@Test
	public void createProjectTest() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewProject();
		createProject("CustomerA", "ProjectC", "DescriptionC", "pradio3");
		verifysucessmsg();
		assertall();
	}
}
