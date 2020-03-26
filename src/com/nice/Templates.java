package com.nice;

import java.util.ArrayList;

/**
 * @author liuyan
 * @date 2020/3/26 - 12:58
 */
public class Templates {
    //模板六 prsf:可生成 private static final
    private static final Customer cust = new Customer();
    //变形psf
    public static final int NUM1=1;
    public static final int NUM2=2;
    public static final String NATION = "china";
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Templates.main");
        int num = 1;
        //soutv
        System.out.println("num = " + num);
        //模板三fori
        String[] arr = new String[]{"nice1","nice2","nice3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public void method(){
        //模板五ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if (list == null) {
            
        }
        //变形inn
        if (list != null) {
            
        }


    }

}
