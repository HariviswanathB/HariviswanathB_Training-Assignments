package Assignment45;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("After Pushing 3 Elements the Stack is : "+s);
		System.out.println("The Popped Element is : "+s.pop());
		System.out.println("The peek Element is : "+s.peek());
		System.out.println("The Final Stack is : "+s);
		

	}

}
