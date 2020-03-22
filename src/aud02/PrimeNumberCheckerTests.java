package aud02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeNumberCheckerTests {
	
	public enum Sizes {
		XXS, XS, S, M, L, XL, XXL, XXXL;
	}
	
	private final static PrimeNumberChecker pnc = new PrimeNumberChecker();
	
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] {
			{2, true},
			{6, false},
			{19, true},
			{22, false},
			{23, true}
		});
	}
	
	@ParameterizedTest
	@MethodSource("primeNumbers")
	public void testPrimeNumberChecker(Integer num, Boolean res) {
		assertEquals(pnc.validate(num), res);
		System.out.println("Parameterized number is: " + num);
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {10,9,8,7,6})
	public void methodValueSource(Integer a) {
		System.out.println("Value: " + a);
	}
	
	@ParameterizedTest
	@EnumSource(value = Sizes.class)
	public void methodEnumSource(Object s) {
		System.out.println("Enum val: " + s);
	}
	
	@ParameterizedTest
	@CsvSource({
		"Algoritmi,6",
		"Strukturno,7",
		"Objektno,8",
		"Kom. Mrezhi,9",
		"Internet tehn.,10"
	})
	public void methodCSWalues(String subject, Integer grade) {
		System.out.println(subject + "\t(" + grade + ")");
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/values.csv", numLinesToSkip = 1)
	public void methodCsvFile(String subj, Integer grade) {
		System.out.println("From file\t\t" + subj + "\t(" + grade + ")");
	}
	
}
