package com.learn.problem;

public class BookProblem {

    private int bId;
    private String bookName;

    public BookProblem(int bId, String bookName) {
        this.bId = bId;
        this.bookName = bookName;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BookP{" +
                "bId=" + bId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
