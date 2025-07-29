package assignment3_array_coll;

import java.util.ArrayList;
import java.util.Collections;

public class productarraylistsort {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Phone");
        products.add("Tablet");
        products.add("Monitor");
        products.add("Keyboard");

        Collections.sort(products);

        System.out.println("Sorted Products using ArrayList:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
