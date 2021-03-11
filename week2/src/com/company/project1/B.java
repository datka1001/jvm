package com.company.project1;

import java.util.Scanner;

public class B {
    public int a,b,c;

    public void m1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        a=scanner.nextInt();
        System.out.println("b=");
        b=scanner.nextInt();
        System.out.println("c=");
        c=scanner.nextInt();
    }
    public void m2(){
        if (a>b && a>c){
            System.out.println("maqsimaluria a-"+a);
        }else if (b>a && b>c){
            System.out.println("maqsimaluria b-"+b);
        }else {
            System.out.println("maqsimaluria c-"+c);
        }
    }
    public void m3(){
        int m = a;
        if(m>b) m=b;
        if(m>c) m=c;
        System.out.println("minimaluria "+m);
    }

}
