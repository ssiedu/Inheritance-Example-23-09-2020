package p2;

import p1.A;

//non-child outside pkg
public class X {
     public void show(){
        A ob=new A();
        System.out.println(ob.p);
        //System.out.println(ob.q);
        //System.out.println(ob.r);
        //System.out.println(ob.s);
    }
}
