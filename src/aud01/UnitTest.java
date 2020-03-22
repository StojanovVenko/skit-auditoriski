package aud01;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTest {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void printMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test
	public void printSalutationMessage() {
		/** 
		 * Neuspeshen test primer
		 */
		assertEquals(message, messageUtil.salutationMessage());
	}
	
}
