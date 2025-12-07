package Assignment45;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListDemo {

	public static void main(String[] args) {
		 // Creating ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Display
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n--- ACCESSING ELEMENT ---");
        System.out.println("ArrayList Element at index 1: " + arrayList.get(1));
        System.out.println("LinkedList Element at index 1: " + linkedList.get(1));

        System.out.println("\n--- INSERTION AT MIDDLE ---");
        arrayList.add(1, "X");     // Slower (shifting)
        linkedList.add(1, "X");    // Faster (node link change)

        System.out.println("ArrayList after insert: " + arrayList);
        System.out.println("LinkedList after insert: " + linkedList);

        System.out.println("\n--- REMOVAL ---");
        arrayList.remove(1);       // Slower
        linkedList.remove(1);      // Faster

        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);

        System.out.println("\n--- TRAVERSAL ---");
        System.out.print("ArrayList Traversal: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        System.out.print("\nLinkedList Traversal: ");
        for (String s : linkedList) {
            System.out.print(s + " ");

	}

}
}
