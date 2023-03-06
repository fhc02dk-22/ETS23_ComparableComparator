package org.campus02.ue.cartcomparator;

import org.campus02.ue.Cart;

import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart cart, Cart t1) {
        int result = t1.getUsername().compareTo(cart.getUsername());
        if (result == 0) {
            return Double.compare(cart.getTotalAmount(), t1.getTotalAmount());
        }
        return result;
    }
}
