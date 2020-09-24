//creating the specification of Account
public interface Account {
    void openAccount();
    void closeAccount();
    void interest();
    default void info(){
        System.out.println("info method of interface");
    }
    public static void show(){
        
    }
    public static void main(String args[]){
        System.out.println("hello useer");
    }
    //...
    //...
}
