package org.campus02.socialmedia;

import java.util.Comparator;

public class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting posting, Posting t1) {
        int res = Integer.compare(t1.getLikes(), posting.getLikes());
        if (res == 0) {
            res = Integer.compare(t1.getShares(), posting.getShares());
        }
        return res;
    }
}
