package cha04;

import java.lang.management.BufferPoolMXBean;
import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    @Override
    public int hashCode() {
        int r = 1;
        r = 31 * r + this.publishDate.hashCode();
        r = 31 * r + this.title.hashCode();
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Book)) {
            return false;
        }

        Book b = (Book) o;
        if (!this.publishDate.equals((b.publishDate))) {
            return false;
        }

        if (!this.title.equals(b.title)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    public Book clone() {
        Book b = new Book();
        b.title = this.title;
        b.comment = this.comment;
        b.publishDate = (Date) this.publishDate.clone();
        return b;
    }
}
