package basicpack;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("This is the Program to Perform Binary Search");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.print("Give the Elements : ");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		Arrays.sort(List);
		int l=0;
		int r=List.length-1;
		boolean found=false;
		System.out.print("Enter the Element to be Searched : ");
		int Ele=sc.nextInt();
		while(l<=r) {
			int mid=(l+r)/2;
			if(List[mid]==Ele) {
				found=true;
				System.out.println("The Element is present in the Array at "+(mid+1)+" position");
				break;
			}
			else if(List[mid]>Ele) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		if(!found) {
			System.out.println("The Element is not present in the Array");
		}
		

	}

}
