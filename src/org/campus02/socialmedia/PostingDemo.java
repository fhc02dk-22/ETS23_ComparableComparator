package org.campus02.socialmedia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class PostingDemo {

    public static void main(String[] args) {
        Posting posting1 = new Posting(3, "post3", "blabla", LocalDateTime.now(), 23, 233, 53);
        Posting posting2 = new Posting(2, "postdf", "blabla", LocalDateTime.now().plusDays(1), 23, 233, 53);
        Posting posting3 = new Posting(32, "postdaf", "blabla", LocalDateTime.now().minusDays(2), 235, 633, 53);
        Posting posting4 = new Posting(1, "postdfa", "blabla", LocalDateTime.now(), 123, 23, 253);

        ArrayList<Posting> postings = new ArrayList<>();
        postings.add(posting1);
        postings.add(posting2);
        postings.add(posting3);
        postings.add(posting4);

        System.out.println(postings);
        Collections.sort(postings);
        System.out.println(postings);
        postings.sort(new RealnameAscComparator());
        System.out.println(postings);
        postings.sort(new DateTimeDescComparator());
        System.out.println(postings);
        postings.sort(new LikesDescSharesDescComparator());
        System.out.println(postings);
    }
}
