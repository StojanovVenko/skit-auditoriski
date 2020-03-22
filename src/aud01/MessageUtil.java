package aud01;

public class MessageUtil {
	
	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		System.out.println("Hi! " + message);
		return "Hi! " + message;
	}

}
