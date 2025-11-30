package basicpack;

import java.util.Scanner;

public class CountPN0Elements {

	public static void main(String[] args) {
		System.out.println("This is the Program to Count positive, negative, zero elements");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] List=new int[size];
		System.out.print("Enter the Elements of the Array");
		for(int i=0;i<size;i++) {
			List[i]=sc.nextInt();
		}
		int p=0,n=0,z=0;
		for(int i=0;i<size;i++) {
			if(List[i]>0)
				p++;
			else if(List[i]<0)
				n++;
			else if(List[i]==0)
				z++;

		}
		System.out.println("The Number of Poitive = "+p+"The Number of Negative = "+n+"The Number of Zeros = "+z);

	}

}
