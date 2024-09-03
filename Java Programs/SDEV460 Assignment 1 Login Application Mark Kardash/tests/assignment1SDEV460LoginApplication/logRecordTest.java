package assignment1SDEV460LoginApplication;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

/* JUnit test to test the recordings in the logfile*/
public class logRecordTest {
	SDEV460LoginAppMarkKardash testingLogFile = new SDEV460LoginAppMarkKardash();
	
	/*Path of the log on PC to be used in test*/
	String logPath = "C:\Users\Mark Kardash\Documents\Java Programs\SDEV460 Assignment 1 Login Application " 
			+ "Mark Kardash"; 
	

	@Test
	public void testFileExists() { /* Firstly, checking if file exists*/
		assertTrue("AttemptLog.txt file does not exist", new File("AttemptLog.txt").exists());
	}
	
	public void testFileIsNotEmpty() { /* Then, testing to make sure that the file is not empty*/ 

		try { 

			String content = logPath.readString(Paths.get("AttemptLog.txt")); 

			assertTrue("The log is empty", content.length()>0); 

		} catch (IOException e) { 

			fail("Could not read log file. Error: " + e.getMessage()); 

		} 

	} 
	
}
