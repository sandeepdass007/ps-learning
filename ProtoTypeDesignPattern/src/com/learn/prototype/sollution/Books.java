package com.learn.prototype.sollution;

public class Books {

    private int bId;
    private String bookName;

    public Books(int bId, String bookName) {
        this.bId = bId;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bId=" + bId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
