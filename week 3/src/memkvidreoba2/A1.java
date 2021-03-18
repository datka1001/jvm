package memkvidreoba2;

import java.util.Scanner;

public class A1 {
    protected int x,y;
    public void m1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("x=");
        x=scanner.nextInt();
        System.out.println("y=");
        y=scanner.nextInt();
    }
    public void m2(){
        x= 12+(int)(Math.random()*((78-12)+1));
        y=12+(int)(Math.random()*((78-12)+1));

    }
    public void m3(){
        System.out.println("y->"+y);
    }
}
