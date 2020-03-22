package aud02;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.Test;

public class Time {
	
	@Test
	public void method1Incorrect() throws InterruptedException {
		assertTimeout(Duration.ofMillis(500), () -> {
			System.out.println("Method 1 has error");
			Thread.sleep(1000);
		});
	}
	
	@Test
	public void method2Correct() throws InterruptedException {
		assertTimeout(Duration.ofMillis(500), () -> {
			System.out.println("Method 2 has no error");
			Thread.sleep(100); // mozhe i bez ova
		});
	}
	
	@Test(timeout=500)
	public void method1OtherVariant() throws InterruptedException {
		System.out.println("method 1 has error with other variant");
		Thread.sleep(1000);
	}
	
	@Test(timeout=500)
	public void method2OtherVariant() throws InterruptedException {
		System.out.println("method 2 has error with other variant");
//		Thread.sleep(1000);
	}
	
}
