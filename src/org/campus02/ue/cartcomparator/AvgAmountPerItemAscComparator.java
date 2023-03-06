package org.campus02.ue.cartcomparator;


import org.campus02.ue.Cart;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart cart, Cart t1) {
        return Double.compare(cart.getAvgAmountPerItem(), t1.getAvgAmountPerItem());
    }
}
