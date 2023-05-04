package org.campus02.socialmedia;

import java.util.Comparator;

public class DateTimeDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting posting, Posting t1) {
        return t1.getDateTime().compareTo(posting.getDateTime());
    }
}
