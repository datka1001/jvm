package memkvidreoba3;

import java.util.Scanner;

public class B3 extends A3{
    protected float a,b;
    public void m4(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        a=scanner.nextInt();
        System.out.println("b=");
        b=scanner.nextInt();
    }
    public void m5(){ }
    public void m6(){
        x=a+(int)(Math.random()*((a-b)+1));
    }
}
