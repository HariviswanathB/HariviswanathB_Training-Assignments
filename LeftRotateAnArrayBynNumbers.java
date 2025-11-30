package basicpack;

import java.util.Scanner;

public class LeftRotateAnArrayBynNumbers {

	public static void main(String[] args) {
		System.out.println("This is the Program to Left rotate an array by n number");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.print("Enter the Elements of the Array");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		System.out.print("Enter the no. of which the Array should be Left Rotated");
		int n=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=List[(i+n)%size];
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
