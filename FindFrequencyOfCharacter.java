package basicpack;

import java.util.Scanner;

public class FindFrequencyOfCharacter {

	public static void main(String[] args) {
		System.out.println("This is the Program to Find the Frequency of the Character in the String");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Str=sc.nextLine();
		System.out.print("Enter the Character for which you need the Frequency : ");
		char ch=sc.next().charAt(0);
		int c=0;
		for(int i=0;i<Str.length();i++) {
			if(Str.charAt(i)==ch) {
				c++;
			}
		}
		System.out.println("The number of "+ch+" present in String is "+c);
		
	}

}
