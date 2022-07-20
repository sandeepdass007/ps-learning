package com.learn.problem;

import java.util.ArrayList;
import java.util.List;

public class BookShopProblem {
    private String shopName;
    private List<BookProblem> ListOfBooks= new ArrayList<>();

    public BookShopProblem(String shopName) {
        this.shopName = shopName;
    }

    public void LoadData(){
        // database fetches books
        for(int i =1;i<=10;i++){
            BookProblem book = new BookProblem(i,"book"+i);
            ListOfBooks.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShopP{" +
                "shopName='" + shopName + '\'' +
                ", ListOfBooks=" + ListOfBooks +
                '}';
    }
}
