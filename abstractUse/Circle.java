package abstractUse;


public class Circle extends shape {
double radius;
Circle(double radius){
    this.radius=radius;
}
    @Override
    void calculateArea() {
    double res = 3.14*radius*radius;
        System.out.println(res);
    }

}
