package basicpack;

import java.util.Scanner;

public class FindSubstringOccurrences {

	public static void main(String[] args) {
		System.out.println("This is the Program to Find Substring Occurrences");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.nextLine();
		System.out.print("Enter the Sub String : ");
		String sub=sc.nextLine();
		int index=0;
		int count=0;
		while((index=str.indexOf(sub,index))!=-1) {
			count++;
			index=index+sub.length();
		}
		System.out.println("The Substring "+sub+" occured "+count+" times in the "+str);
		

	}

}
