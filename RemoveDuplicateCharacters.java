package basicpack;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		System.out.println("This is the Program to Remove Duplicate Characters");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Str=sc.nextLine();
		String Org="";
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			if(Org.indexOf(ch)==-1) {
				Org+=ch;
			}
		}
		System.out.print("String After Removal of Duplicates is : "+Org);
		

	}

}
