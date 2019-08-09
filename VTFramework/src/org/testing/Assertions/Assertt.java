package org.testing.Assertions;

public class Assertt {
	public static boolean assert1(String actual, String expected)
	{
		if(actual.equals(expected))
		{
			System.out.println("Assertion Pass");
			return true;
		}else
		{
			System.out.println("Assertion Fail");
			return false;
		}
	}

}
