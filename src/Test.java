public class Test {
    public static void display(final int n){ //final param are read-only, inside method we can read them cant change
        System.out.println(n);  //reading and displaying n
        //n=n+1;  //changing n by 1
        System.out.println(n);  // reading and displaying n again
    }
    
    public static void main(String args[]){
        display(10);
    }
}
