package memkvidreobitoba1;

import java.util.Scanner;

public class A {
    protected int x;
    public A(){
        System.out.println("hello my A class");
    }
    public void m1(){
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
    }
    public void m2(){
        System.out.println("x="+x);
    }
    public void m3(){
        if (x%2!=0) System.out.println("x kentia");else System.out.println("x luwia");
    }
}
