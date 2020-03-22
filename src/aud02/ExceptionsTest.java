package aud02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExceptionsTest {
	
	public int divide(Integer a, Integer b) {
		if(b == 0) throw new ArithmeticException();
		return a/b;
	}
	
	@ParameterizedTest
	@CsvSource({
		"0,0",
		"0,2",
		"2,0",
		"2,2"
	})
	public void divideTest(Integer a, Integer b) {
//		System.out.println(a + "/" + b + "=" + (a/b));
		assertThrows(ArithmeticException.class, () -> divide(a, b));
	}

}
