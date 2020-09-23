public class MediStud extends Stud {
    private String spec;
    private int prof;
    
    //MediStud is overriding result method of Stud
    public void result(int per){
        if(per>=50){
            System.out.println("Medical Student Passed");
        }else{
            System.out.println("Medical Student Failed");
        }
    }
    
    public void setMediData(String spec, int prof){
        this.spec=spec;
        this.prof=prof;
    }
    public void showMediData(){
        System.out.println("Spec  "+spec);
        System.out.println("Prof  "+prof);
    }
    public static void main(String args[]){
        MediStud ms=new MediStud();
        ms.setPersonalInfo(501, "XYZ");
        ms.setMediData("Artho", 3);
        ms.showPersonalInfo();
        ms.showMediData();
        ms.result(56);  //always call parent's result and it is avaible
    }
}
