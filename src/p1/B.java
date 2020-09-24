package p1;

// NonChild of A with in same pkg
public class B {
     public void show(){
        A ob=new A();
        System.out.println(ob.p);
        System.out.println(ob.q);
        System.out.println(ob.r);
       // System.out.println(ob.s);
    }
}
