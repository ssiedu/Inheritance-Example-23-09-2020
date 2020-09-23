public class EngStud extends Stud {
    
    private String branch;
    private int sem;
    
    public void setEngInfo(String branch, int sem){
        this.branch=branch;
        this.sem=sem;
    }
    public void showEngInfo(){
        System.out.println("Branch   : "+branch);
        System.out.println("Semester : "+sem);
    }
    
    public static void main(String args[]){
        EngStud es=new EngStud();
        es.setPersonalInfo(111, "AAA");
        es.setEngInfo("CS", 2);
        es.showPersonalInfo();
        es.showEngInfo();
        es.result(45);
    }
}
