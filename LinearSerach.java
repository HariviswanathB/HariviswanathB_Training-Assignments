package basicpack;

import java.util.Scanner;

public class LinearSerach {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sie of the arr:");
		int size=sc.nextInt();
		int[] intArray=new int[size];
		System.out.print("Give the Elements of the Array :");
		for(int i=0;i<size;i++) {
			intArray[i]=sc.nextInt();
		}
		System.out.print("Enter the Element that you need to Search :");
		int Ele=sc.nextInt();
		int ans=0;
		boolean found=true;
		for(int i=0;i<size;i++) {
			if(intArray[i]==Ele) {
				ans=i+1;
				break;
			}
		}
		if(found)
		    System.out.println("The Element is present in the position of "+ans);
		else
			 System.out.println("Element is not present in the Array");
	}

}
