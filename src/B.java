public class B extends A {
    public B(){
        super(1,2);   //calling one arg cosntructor of parent 
        System.out.println("Zero Arg Constructor of B");
    }
    public B(int n){
        super(1,2);
        System.out.println("One Arg Constructor of B");
    }
    public B(int a, int b){
        super(10);
        System.out.println("Two Arg Constructor of B");
    }
    public static void main(String args[]){
        B ob=new B(5,2);
    }
}
