package c_ex_1;

public class Ex4 {
    private int x,y;
    public Ex4(int _x,int _y){
        System.out.println("hello class");
        x=_x;
        y=_y;
    }
    public void m1(){
        if (x>0){
            System.out.println(x*4-y);
        }else if (x==0) System.out.println(2*x+y);
    }
    public void m2(){
        if (y>0){
            System.out.println(4*x+y);
        }else if (y==0) System.out.println(2*x-y);
    }
}
