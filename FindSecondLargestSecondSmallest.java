package basicpack;

import java.util.Scanner;

public class FindSecondLargestSecondSmallest {

	public static void main(String[] args) {
		System.out.println("This is the Program to Find Second Largest / Second Smallest");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.print("Give the Elements : ");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int slargest=Integer.MIN_VALUE;
		
		int smallest=Integer.MAX_VALUE;
		int ssmallest=Integer.MAX_VALUE;
		
		for(int num:List) {
			if(num>largest) {
				slargest=largest;
				largest=num;
			}
			else if(num>slargest && num!=largest) {
				slargest=num;
			}
		}
		
		for(int num:List) {
			if(num<smallest) {
				ssmallest=smallest;
				smallest=num;
			}
			else if(num<ssmallest && num!=smallest) {
				ssmallest=num;
			}
		}
		System.out.println("The Second Smallest Element in the Array is : "+ssmallest);
		System.out.println("The Second Largest Element in the Array is : "+slargest);

	}

}
