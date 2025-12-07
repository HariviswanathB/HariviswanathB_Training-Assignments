package Assignment45;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class VotingEligibility {
	
	static void checkAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Candidate is not Eligible to vote");
		}
		else {
			System.out.println("Candidate is Eligible to vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try{
			checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
