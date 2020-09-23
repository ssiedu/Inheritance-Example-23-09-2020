public  class Q extends P {
    //m1,m2 (concrete) ,m3,m4 (abstract)
    void m3(){
        System.out.println("hello from m3 of Q");
    }
    void m4(){
        System.out.println("hello from m4 of Q");
    }
}

/*
    when you inherit an abstract class, 
    to make child class concrete you must override the all the abstract methods of parent class.
    or
    declare the child class also abstract.
*/