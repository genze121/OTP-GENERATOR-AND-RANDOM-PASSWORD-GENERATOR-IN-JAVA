package OTP;

import java.util.Random;
import java.util.Scanner;

public class OTPGENERATOR {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Taking the user input
		System.out.print("Enter the number to generate the OTP:- ");

		int OTPNumber = scanner.nextInt();

		// Declaring Random object to generate random OTP
		Random random = new Random();

		int targetValue = 0;

		// Defining condition for OTP to generate 6-5-4-3-2-1 digits OTP

		if (OTPNumber >= 1 && OTPNumber <= 6) {
			System.out.println("The OTP for " + OTPNumber + " digits is:- ");
			for (int index = 0; index < OTPNumber; index++) {
				targetValue = random.nextInt(10);
				System.out.print(targetValue);
			}
		} else {
			System.out.println("0 is invalid OTP number!!");
		}
	}

}
