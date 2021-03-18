package c_ex_1;

public class Ex1 {
    private int x;
    public Ex1(){
        System.out.println("hello my class");

    }
    public void m1(int _x){
            x=_x;
            if (_x%2!=0){
                System.out.println("x kentia");
            }else {
                System.out.println("x luwia");
        }
    }

}
