package assignment1SDEV460LoginApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class userLoginTest1 {
	
	SDEV460LoginAppMarkKardash loginTest = new SDEV460LoginAppMarkKardash();
	String testUsername = "TestUser";
	String testPassword = "1234";
	@Test
	/*Test method to compare username and password*/
	public void testUserLogin() {
		
		System.out.println("Inside testUserLogin()");
		String compareUsernames = SDEV460LoginAppMarkKardash.assertEquals(testUsername, loginTest.userLogin());
		String comparePasswords = SDEV460LoginAppMarkKardash.assertEquals(testPassword, loginTest.userLogin());
		
	}

}
