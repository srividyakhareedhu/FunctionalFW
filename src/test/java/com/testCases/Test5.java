package com.testCases;

import org.testng.annotations.Test;

import com.library.library;

public class Test5 extends library{
	
	@Test
	public void createProjectTest() throws Throwable
	{
		login();
		clickOnTask();
		clickOnProAndCustomer();
		clickOnCreateNewProject();
		createProject("CustomerA", "ProjectB", "DescriptionB", "pradio2");
		verifysucessmsg();
		assertall();
	}
}
