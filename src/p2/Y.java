package p2;

//its child outside pkg
public class Y extends p1.A {
    void display(){
        System.out.println(p);
        System.out.println(q);
        //System.out.println(r);
        //System.out.println(s);
    }
}
