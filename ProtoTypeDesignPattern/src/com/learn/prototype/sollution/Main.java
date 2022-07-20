package com.learn.prototype.sollution;


public class Main {
    public static void main(String arg[]) throws CloneNotSupportedException {
        //ShalloClonning();
        deepClonning();

    }
     public static void ShalloClonning() throws CloneNotSupportedException {
         BookShop bookShop1= new BookShop();
         bookShop1.setShopName("Shop-1");
         bookShop1.LoadData();//1-min

         BookShop bookShop2= (BookShop) bookShop1.clone();
         bookShop2.setShopName("Shop-2");
         bookShop2.getListOfBooks().remove(1);
         System.out.println(bookShop1);
         System.out.println(bookShop2);
     }

    public static void deepClonning() throws CloneNotSupportedException{
        BookShop bookShop1= new BookShop();
        bookShop1.setShopName("Shop-1");
        bookShop1.LoadData();

        BookShop bookShop2= (BookShop) bookShop1.clone();
        bookShop2.setShopName("Shop-2");
        bookShop2.getListOfBooks().remove(1);
        System.out.println(bookShop1);
        System.out.println(bookShop2);
    }

}
