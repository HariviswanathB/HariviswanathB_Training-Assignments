package Assignment3;

import java.util.Scanner;

class Students{
	private String name;
	private int roll_no;
	private double marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		if(marks>=0 && marks<=100) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid marks! Marks should be between 0 and 100.");
		}
	}
	
}

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Students s = new Students();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        s.setName(name);


        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        s.setRoll_no(rollNo);

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        s.setMarks(marks);


        System.out.println("\n--- Student Details ---");
        System.out.println("Name      : " + s.getName());
        System.out.println("Roll No   : " + s.getRoll_no());
        System.out.println("Marks     : " + s.getMarks());

	}

}
