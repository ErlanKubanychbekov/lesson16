public class Circle extends Shape{
    private double radius;

    private final double pi= 3.14;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public void calcArea(){
        System.out.println("Area "+getShapeName());

        double area = pi*(radius*radius);
        System.out.println(area);

    }
    public double calcPeremeter(){
        System.out.println("Perimeter " + getShapeName() );
        double peremeter = 2 * pi * radius;
        System.out.println(peremeter);

        return peremeter;

    }

}
