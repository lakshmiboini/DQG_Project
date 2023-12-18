package com.pageobjectmodel;



import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class DQG_Test_Run extends BaseClass {

	

		@Test
		public void test() throws Throwable, AWTException 
		{
			dqhomepage.login();
			
			validations.Validation();
		}
	}
