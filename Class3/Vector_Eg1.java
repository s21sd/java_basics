package Class3;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Eg1 {
    public static void main(String[] ar) {
        // Vector v = new Vector(4); // initial capacity is 4
        Vector v = new Vector(4, 2); // initial capacity is 4, increment is 2
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        System.out.println("Capacity after adding 5 elements: " + v.capacity());
        System.out.println("Size after adding 5 elements: " + v.size());

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}

// iterable interface-> collection interface-> list -> ->queue -> set ->
// list-> arraylist, vector, linkedlist, stack
// queue-> priorityqueue, linkedlist ,arrayqueue , deque
// set-> hashset, linkedhashset, treeset, sortedset interface