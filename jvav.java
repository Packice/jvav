package com.jvav.code;
import java.util.*;

public class jvav{

    public static void say (String language){
        System.out.println(language);
        /*可以来说话*/
    }
    public static void and (int matha,int mathb){
        /*做加法*/
        int out;
        out=matha+mathb;
        System.out.println(out);

    }
    public static void jian (int matha,int mathb){
        /*做减法*/
        int out;
        out=matha-mathb;
        System.out.println(out);
    }
 
    public static void mu(double matha,double mathb){
        /*幂运算*/
        double out = Math.pow(matha,mathb);
        System.out.println(out);
    }
    /*public static void line (int in,int in2)
    {
        
        while(true){
            while(in == 0){
            System.out.println("―");
            in --;
            }
        System.out.println("\n");
        in2 --;
        }
        
    }*/
    
}
