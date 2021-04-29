package PasswordGenerator;

public class PasswordGenerator {

	public static void main(String[] args) {

		int passwordLength = 10;

		String password = passwordSet(passwordLength);

		System.out.println("Random Generated Password is:- " + password);
	}

	private static String passwordSet(int passwordLength) {

		String passwordPattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@~#$%^&*()]{";
		char[] password = new char[passwordLength];
		for (int i = 0; i < passwordLength; i++) {
			int random = (int) (Math.random() * passwordPattern.length());
			password[i] = passwordPattern.charAt(random);
		}
		return new String(password);
	}

}
