package com.learn.problem;

public class MainProblem {

    public static void main(String arg[]){

        BookShopProblem bookshop1= new BookShopProblem("BookShop");
        bookshop1.LoadData();//1-mins

        BookShopProblem bookshop2= new BookShopProblem("BookShop");
        bookshop2.LoadData();

        System.out.println(bookshop1);
        System.out.println(bookshop2);
    }
}
