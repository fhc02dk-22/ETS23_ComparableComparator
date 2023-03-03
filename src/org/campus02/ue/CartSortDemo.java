package org.campus02.ue;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 8.95));
        carts.add(new Cart("max", 10, 10, 500));
        carts.add(new Cart("susi", 5, 10, 400));

        Collections.sort(carts);
        System.out.println(carts);

        // sortiere nach username asc definiert in CartUsernameComparator
        Collections.sort(carts, new CartUsernameComparator());
        System.out.println(carts);

        // sortiere mittels CartTotalItemsComparator
        //Collections.sort(carts, new CartTotalItemsComparator());
        //andere Möglichkeit
        carts.sort(new CartTotalItemsComparator());
        System.out.println(carts);


    }
}
