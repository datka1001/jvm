package memkvidreoba3;

import java.util.Scanner;

public class A3 {
    protected float x,y;
    public void m1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("x=");
        x=scanner.nextInt();
        System.out.println("y=");
        y=scanner.nextInt();
    }
    public void m2(){
        x= 0+(int)(Math.random()*((0-12)+1));
        y=0+(int)(Math.random()*((0-12)+1));
    }
    public void m3(){
        System.out.println((y-3*x)/3);
    }
}
