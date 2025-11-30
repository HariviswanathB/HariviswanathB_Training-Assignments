package basicpack;

import java.util.Scanner;

public class FrquencyoftheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This is the Program to print the Frequency of the Number in the Array !!");
		System.out.print("Enter the size of the Array : ");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.println("Give the Array Elements :");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		System.out.println("Enter the number which you want to count :");
		int n=sc.nextInt();
		int c=0;
		for(int i:List) {
			if(i==n)
				c++;
		}
		System.out.println("The number"+n+"exists "+c+" time in the Array");
	}

}
