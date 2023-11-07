package com.lbrce.cse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
	@Test
	public void testCase3()
	{
		UserValidation ob=new UserValidation();
		Assert.assertEquals(false,ob.check("srinu", "srinu@123"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("SRINU", "SRINU@12345"));
	}
	
}
