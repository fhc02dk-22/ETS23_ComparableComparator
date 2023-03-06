package org.campus02.ue.cartcomparator;


import org.campus02.ue.Cart;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart cart, Cart t1) {
        return Double.compare(t1.getAvgAmountPerArticle(), cart.getAvgAmountPerArticle());
    }
}
