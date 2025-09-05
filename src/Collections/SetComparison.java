package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {
        // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        System.out.println("HashSet Output: " + hashSet);

        // LinkedHashSet example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet Output: " + linkedHashSet);

        // TreeSet example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet Output: " + treeSet);
    }
}