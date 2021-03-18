package c_ex_1;

public class Ex3 {
    private int a, b, x;

    public Ex3() {
    }

    public Ex3(int _a, int _b, int _x) {
        a = _a;
        b = _b;
        x = _x;
    }

    public void m1() {
        if (a!=b) System.out.println("a b warmoadgens shualeds"); else System.out.println("a b ar warmoadgens shualeds");
    }

    public void m2() {
        if (a > b) {
            if (x >= b && x <= a) {
                System.out.println("x mdebareobs a b shualeshi");
            } else {
                System.out.println("x ar mdebareobs a b shualedshi");
            }
        } else if (b > a) {
            if (x <= b && x >= a) {
                System.out.println("x mdebareobs a b shualeshi");
            } else {
                System.out.println("x ar mdebareobs a b shualedshi");
            }
        }
    }
}