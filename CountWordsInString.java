package basicpack;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("This is the Program to Count Words In A String");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String");
		String Str=sc.nextLine().trim();
		if(Str.isEmpty())
			System.out.println("Words : 0");
		else {
			String[] List=Str.split("\\s+");
			System.out.println("Words : "+List.length);
		}

	}

}
