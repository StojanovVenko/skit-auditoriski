package aud02;

public class PrimeNumberChecker {
	
	public Boolean validate(final Integer num) { 
		for(int i=2; i<Math.sqrt(num*1.0); ++i) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}