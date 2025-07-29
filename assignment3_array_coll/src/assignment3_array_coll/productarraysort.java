package assignment3_array_coll;

import java.util.Arrays;

public class productarraysort {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Phone", "Tablet", "Monitor", "Keyboard"};
        Arrays.sort(products);
        System.out.println("Sorted Products:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
