package assignment1SDEV460LoginApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class userLoginTest3 {
	SDEV460LoginAppMarkKardash loginTest = new SDEV460LoginAppMarkKardash();
	
	/* This time, we leave the correct username, but put an incorrect password. This should generate an error, as
	 * it does not match the password hardwired into the original program.
	 */
	String testUsername = "TestUser";
	String testPassword = "7itit";

	@Test
	public void test() {
		System.out.println("Inside testUserLogin()");
		String compareUsernames = SDEV460LoginAppMarkKardash.assertEquals(testUsername, loginTest.userLogin());
		String comparePasswords = SDEV460LoginAppMarkKardash.assertEquals(testPassword, loginTest.userLogin());
		
	}

}
