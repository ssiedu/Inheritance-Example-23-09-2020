
public abstract class P {
   //concrete methods
    final void m1(){
        System.out.println("hello from m1 of P");
    }
    void m2(){
        System.out.println("hello from m2 of P");
    }
    //abstract methods (with out body)
    abstract void m3();
    abstract void m4();
}
/*
    m1 is a final method    so it cant be overridden.

    m2 is neither abstract nor final (a method which is not final is open for overriding)
    (any one willingly wants to override can override)

    m3,m4 are abstract, must be overridden in order to create a concrete child
*/