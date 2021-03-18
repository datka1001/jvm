package c_ex_1;

public class Ex2 {
    private int x;
    public Ex2(){}
    public Ex2(int _x){
        x=_x;
    }
    public void m1(){
        if (x>=5 && x<=24){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
