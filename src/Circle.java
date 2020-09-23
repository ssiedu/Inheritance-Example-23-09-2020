public class Circle extends Shape {
    //we cant override setRadius
  
    public void computeArea(){
        double area=3.14*radius*radius;
        System.out.println("Area of Circle : "+area);
    }
}
