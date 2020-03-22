package aud01;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Unit2Test {

	String message = "Venko";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Class: Unit2Test: method testSalutationMessage()");
		assertEquals("Hi! " + message, messageUtil.salutationMessage());
	}
}
