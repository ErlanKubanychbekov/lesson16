
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle",2,4);
        rectangle.calcArea();
        rectangle.calcPeremeter();

        System.out.println("---------------------------------------------------------");

        Circle circle = new Circle("Circle",5);
        circle.calcPeremeter();
        circle.calcArea();
        System.out.println("---------------------------------------------------------");

        Triangle triangle = new Triangle("Triangle",2,4,3);
        triangle.calcPeremeter();
        triangle.calcArea();


    }
}