package com.company.project1;

import java.util.Scanner;

public class C {
    public int a,b,c;
    public void m1(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        a=scanner.nextInt();
        System.out.print("b=");
        b=scanner.nextInt();
        System.out.print("c=");
        c=scanner.nextInt();
    }
    public void m2(){
        System.out.println("a-s bolo cifria "+a%10);
    }
    public void m3(){
        String s=b+"";
        int r=Integer.parseInt(s.charAt(0)+"");
        System.out.println("b-s pirveli cifria"+r);
    }
    public void m4(){
        String s=c+"";
        for (int i=0;i<s.length();i++){
            int k = Integer.parseInt(s.charAt(i)+"");
            System.out.println(k);
        }
    }
}
