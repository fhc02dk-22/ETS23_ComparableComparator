package org.campus02.ue;

import org.campus02.ue.cartcomparator.ArticlesDescItemsAscComparator;
import org.campus02.ue.cartcomparator.AvgAmountPerArticleDescComparator;
import org.campus02.ue.cartcomparator.AvgAmountPerItemAscComparator;
import org.campus02.ue.cartcomparator.UsernameDescTotalAmountAscComparator;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 8.95));
        carts.add(new Cart("susi", 1, 2, 36));
        carts.add(new Cart("max", 10, 5, 500));
        carts.add(new Cart("susi", 10, 10, 400));

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

        /**
         * ÜBUNGSBLATT DEMO
         */
        System.out.println();
        carts.sort(new ArticlesDescItemsAscComparator());
        System.out.println("Sort: Number of Articles Desc and Itmes Asc");
        System.out.println(carts);

        System.out.println("Sort: Username Desc and TotalAmount Asc");
        carts.sort(new UsernameDescTotalAmountAscComparator());
        System.out.println(carts);

        System.out.println("Sort: Average Amount Per Items ASC");
        carts.sort(new AvgAmountPerItemAscComparator());
        System.out.println(carts);

        System.out.println("Sort: Average Amount Per Article Desc");
        carts.sort(new AvgAmountPerArticleDescComparator());
        System.out.println(carts);
    }
}
