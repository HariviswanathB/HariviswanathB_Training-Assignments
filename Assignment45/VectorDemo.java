package Assignment45;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();  // No Generics

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        System.out.println("Vector Elements: " + v);

        System.out.println("Element at index 1: " + v.get(1));

        v.remove("Banana");
        System.out.println("After Removing Banana: " + v);

        System.out.println("Size: " + v.size());
		
		

	}

}
