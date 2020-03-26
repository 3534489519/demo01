package com.nice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    /**
     * sout :System.out.println("HelloWorld");
     * spvm :public static void main(String[] args)
     *
     * @param args
     */
    private String name;

    public static void main(String[] args) {
        //region Description
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        //shift+enter:上一行
        //ctrl+shift+enter:下一行
        // synchronized ();
        ArrayList list = new ArrayList();
        //endregion
        list.add(0,123);
        Date date = new Date();
    }
    public void method(){
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
