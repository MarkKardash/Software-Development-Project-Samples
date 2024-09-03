package assignment1SDEV460LoginApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class userLoginTest4 {
	SDEV460LoginAppMarkKardash loginTest = new SDEV460LoginAppMarkKardash();
	
	/*Now we change the username to an invalid one, keeping the password the same. It should, expectedly, generate an error*/
	String testUsername = "jyul.h";
	String testPassword = "1234";

	@Test
	public void test() {
		System.out.println("Inside testUserLogin()");
		String compareUsernames = SDEV460LoginAppMarkKardash.assertEquals(testUsername, loginTest.userLogin());
		String comparePasswords = SDEV460LoginAppMarkKardash.assertEquals(testPassword, loginTest.userLogin());
		
		
		
	}

}
