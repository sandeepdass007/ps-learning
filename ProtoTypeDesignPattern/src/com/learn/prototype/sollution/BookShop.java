package com.learn.prototype.sollution;

import com.learn.problem.BookProblem;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;
    private List<Books> ListOfBooks;

    public BookShop() {
        this.ListOfBooks = new ArrayList<>();
    }

    public void LoadData(){
        for(int i =1;i<=10;i++){
            Books books = new Books(i,"book"+i);
            ListOfBooks.add(books);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", ListOfBooks=" + ListOfBooks +
                '}';
    }

//    @Override
//   protected Object clone() throws CloneNotSupportedException {
//       return super.clone();
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();

        for(Books books : this.getListOfBooks()){
            bookShop.getListOfBooks().add(books);
        }
        return bookShop;

    }

    public String getShopName() {
        return shopName;
    }

    public List<Books> getListOfBooks() {
        return ListOfBooks;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setListOfBooks(List<Books> listOfBooks) {
        ListOfBooks = listOfBooks;
    }
}
