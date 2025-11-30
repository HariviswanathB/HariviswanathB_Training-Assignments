package basicpack;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		System.out.println("This is the Program to Reverse the String");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Str=sc.nextLine();
		String reversed=new StringBuilder(Str).reverse().toString();
		System.out.print("The Reversed String is : ");
		System.out.println(reversed);
		
		

	}

}
