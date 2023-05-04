package org.campus02.socialmedia;

import java.time.LocalDateTime;
import java.util.Objects;

public class Posting implements Comparable<Posting> {
    private int id;
    private String realName;
    private String screenName;
    private LocalDateTime dateTime;
    private int likes;
    private int shares;
    private int views;

    public Posting(int id, String realName, String screenName, LocalDateTime dateTime, int likes, int shares, int views) {
        this.id = id;
        this.realName = realName;
        this.screenName = screenName;
        this.dateTime = dateTime;
        this.likes = likes;
        this.shares = shares;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public String getRealName() {
        return realName;
    }

    public String getScreenName() {
        return screenName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }

    public int getViews() {
        return views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return id == posting.id && likes == posting.likes && shares == posting.shares && views == posting.views && Objects.equals(realName, posting.realName) && Objects.equals(screenName, posting.screenName) && Objects.equals(dateTime, posting.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, realName, screenName, dateTime, likes, shares, views);
    }


    @Override
    public String toString() {
        return "Posting{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", screenName='" + screenName + '\'' +
                ", dateTime=" + dateTime +
                ", likes=" + likes +
                ", shares=" + shares +
                ", views=" + views +
                '}';
    }

    @Override
    public int compareTo(Posting posting) {
        return Integer.compare(this.id, posting.id);
    }
}
