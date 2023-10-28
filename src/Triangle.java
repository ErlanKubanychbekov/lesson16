public class Triangle extends Shape{
    private double a ;
    private double b ;
    private double  c;

    public Triangle(String shapeName, double a, double b, double c) {
        super(shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void calcArea(){
        System.out.println("Area " + getShapeName() );
        double area  = (a * b) / 2;
        System.out.println(area);
    }
    @Override
    public double calcPeremeter(){
        System.out.println("Perimeter " + getShapeName() );
        double peremeter = a + b + c;
        System.out.println(peremeter);
        return peremeter;

    }
}
