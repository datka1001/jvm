package memkvidreoba2;

public class C1 extends B1{
    protected int z,r;

    public void setZ(int _z) {
        z = _z;
    }
    public void setR(int _r) {
        z = _r;
    }
    public void m7(){
        int maxXY,maxRZ, max;
        maxXY=Math.max(x,y);
        maxRZ=Math.max(r,z);
        max=Math.max(maxRZ,maxXY);
        System.out.println("max="+max);
    }
    public void m8(){
        System.out.println((Math.pow(x,4)+2*y)/(z-r));

    }
    public void m9(){
        System.out.println("m9->"+m4()+(r/(z+4)));
    }
}
