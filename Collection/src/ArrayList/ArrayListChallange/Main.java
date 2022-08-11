package ArrayList.ArrayListChallange;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Miska"));
        for (int i = 1; i < 10; i++) {
            products.add(new Product("produkt" + i));
        }
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }

    }

}
