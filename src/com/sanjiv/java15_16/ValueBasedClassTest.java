package com.sanjiv.java15_16;

public class ValueBasedClassTest {
   public static void main(String[] args) {
      Double d = 10.0;
      synchronized (d) {
         System.out.println(d);			
      } 
   }
}
