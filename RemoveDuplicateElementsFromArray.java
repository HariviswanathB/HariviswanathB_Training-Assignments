package basicpack;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This is the Program to Remove duplicate elements from array");
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.print("Give the Elements of the Array : ");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		HashSet<Integer> set=new HashSet<>();
		for(int i:List) {
			set.add(i);
		}
		System.out.println("The Final Array is : ");
		for(int i:set){
			System.out.print(i+" ");
		}
	}

}
