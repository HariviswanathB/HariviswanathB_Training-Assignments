package basicpack;

import java.util.Scanner;

public class CompareTwoStringsEqualsCompareTo {

	public static void main(String[] args) {
		System.out.println("This is the Program to Compare two strings (equals, compareTo)");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First String");
		String Fstr=sc.nextLine();
		System.out.print("Enter the Second String");
		String Sstr=sc.nextLine();
		if(Fstr.equals(Sstr)) {
			System.out.print("equals(): Both String are same\n");
		}
		else {
			System.out.print("equals(): Both String are Different\n");
		}
		int res=Fstr.compareTo(Sstr);
		if(res==0) {
			System.out.print("compareTo(): Both strings are EQUAL");
		}
		else if(res>0) {
			System.out.println("compareTo(): First string is GREATER");
		}
		else {
			System.out.println("compareTo(): First string is SMALLER");
		}

	}

}
