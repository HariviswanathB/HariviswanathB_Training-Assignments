package basicpack;

import java.util.Scanner;

public class ReplaceCharacterOrSubstring {

	public static void main(String[] args) {
		System.out.println("This is the Program to Replace a Character or Substring");
		System.out.print("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String Str=sc.nextLine();
		System.out.print("Enter which String you want to replace with which ");
		String oldStr=sc.nextLine();
		String newStr=sc.nextLine();
		Str=Str.replace(oldStr,newStr);
		System.out.print("After Replacement the String is : "+Str);
		
		
		

	}

}
