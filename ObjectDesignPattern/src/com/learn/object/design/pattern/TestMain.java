package com.learn.object.design.pattern;

public class TestMain {
    public static void main(String[] args) {
        for(int i =1;i<=10;i++){
            final int num = i;
            new Thread(() -> {
                final String queryData = testString(num);
                System.out.println(queryData);
            }).start();
        }
    }

    public static String testString(int i){
        String result ="";
        for(char ch='a'; ch<='z';ch++){
            result = ""+ch;
        }
        System.out.println("called"+i);
        return result;
    }
}
