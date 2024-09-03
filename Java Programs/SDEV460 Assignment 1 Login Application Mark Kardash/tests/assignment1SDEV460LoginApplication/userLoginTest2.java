package assignment1SDEV460LoginApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class userLoginTest2 {
	SDEV460LoginAppMarkKardash loginTest = new SDEV460LoginAppMarkKardash();
	/*Changing the credentials, to look different than those hardwired in the program. Should generate an error,
	 * as they are not the same.
	 */
	String testUsername = "ruyuii";
	String testPassword = "7889";

	@Test
	public void test() {
		System.out.println("Inside testUserLogin()");
		String compareUsernames = SDEV460LoginAppMarkKardash.assertEquals(testUsername, loginTest.userLogin());
		String comparePasswords = SDEV460LoginAppMarkKardash.assertEquals(testPassword, loginTest.userLogin());
		
		
	}

}
