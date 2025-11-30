package basicpack;

import java.util.Scanner;

public class CountDigitsAlphabetsSpecialCharacters {

	public static void main(String[] args) {
		System.out.println("This is the Program to Count Digits,Alphabets,Special Characters");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Str=sc.nextLine();
		int Alpha=0,Digi=0,Speci=0;
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			if(Character.isLetter(ch)) {
				Alpha++;
			}
			else if(Character.isDigit(ch)) {
				Digi++;
			}
			else {
				Speci++;
			}
		}
		System.out.println("The Number of Alphabets is "+Alpha+" ,Digits is "+Digi+" Special Characters is "+Speci);
		

	}

}
