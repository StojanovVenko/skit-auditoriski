package aud01;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {
	
	// Vo JUnit 5 BeforeEach ne postoi, zameneto e so Before
	@Before 
	public void executeBeforeEachTest() {
		System.out.println("Before each");
	}
	
	// Vo JUnit 5 BeforeAll e zameneto so BeforeClass
	@BeforeClass
	public static void executeBeforeAllTests() {
		System.out.println("Before all (First executed method)");
	}
	
	// Vo JUnit 5 AfterEach ne postoi, zameneto e so After
	@After
	public void executeAfterEachTest() {
		System.out.println("After each");
	}
	
	// Vo JUnit 5 AfterAll e zameneto so AfterClass
	@AfterClass
	public static void executeAfterAllTests() {
		System.out.println("After all (Last executed method)");
	}
	
	@Test
	public void method1() {
		System.out.println("First method");
	}
	
	@Test
	public void method2() {
		System.out.println("Second method");
	}
	
	// Anotacijata @Disable e zameneta vo JUnit 5 e zameneta so @Ignore0
	@Test
	@Ignore
	public void method3() {
		System.out.println("Third method");
	}
	

}
