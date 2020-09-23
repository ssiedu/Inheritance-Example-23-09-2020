public class Stud {
    private int rno;
    private String name;
    private final  int PASSING_MARKS=33;
    
    public void result(int per){
        if(per>PASSING_MARKS){
            System.out.println("Student Passed");
        }else{
            System.out.println("Student Failed");
        }
    }
    public void setPersonalInfo(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPersonalInfo(){
        System.out.println("Roll No.  : "+rno);
        System.out.println("Stud Name : "+name);
    }
}
