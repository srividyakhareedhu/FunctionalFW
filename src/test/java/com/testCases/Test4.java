package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test4 extends library{
	
	@Test
	public void createProjectTest() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewProject();
		createProject("CustomerA", "ProjectA", "DescriptionA", "pradio1");
		verifysucessmsg();
		assertall();
	}
}
