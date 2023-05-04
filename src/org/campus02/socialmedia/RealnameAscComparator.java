package org.campus02.socialmedia;

import java.util.Comparator;

public class RealnameAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting posting, Posting t1) {
        return posting.getRealName().compareTo(t1.getRealName());
    }
}
