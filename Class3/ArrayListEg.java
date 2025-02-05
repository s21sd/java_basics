package Class3;

import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] ar) {
        // ArrayList<String> st = new ArrayList<String>();
        ArrayList<String> st = new ArrayList<String>(); // initial capacity is 10
        st.add("A");
        st.add("23");
        st.add("C");
        st.add("D");
        st.add("E");
        st.add("F");
        st.add(1, "Sunny"); // Convert double to string
        System.out.println(st.get(0));
        // System.out.println(st.set(1,"Sunny2")); // Replace element at index 1
        System.out.println(st.set(1, "Asmitha")); // Replace element at index 1
        st.clear(); // Clear all elements
        // st.remove(2); // Remove element at index 2
        // for (String s : st) {
        // System.out.println(s);
        // }
        System.out.println(st.contains("Asmitha2"));
        System.out.println(st);
    }

}
