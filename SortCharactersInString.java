package basicpack;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInString {

	public static void main(String[] args) {
		System.out.println("This is the Program to Sort Characters in a String");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String : ");
		String Str=sc.nextLine();
		char[] List=Str.toCharArray();
		Arrays.sort(List);
		String sorted=new String(List);
		System.out.print("String after sorted : "+sorted);
		
	}

}
