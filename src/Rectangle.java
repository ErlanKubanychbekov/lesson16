public class Rectangle extends Shape{

    private int a;
    private int b;


    public Rectangle(String shapeName, int a, int b) {
        super(shapeName);
        this.a = a;
        this.b = b;

    }



    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }



    @Override
    public void calcArea(){
        System.out.println("Area " + getShapeName() );
        double area = (double) a * b;
        System.out.println(area);

    }
    @Override
    public double calcPeremeter(){
        System.out.println("Perimeter " + getShapeName() );
        double peremeter = (a+b) * 2;
        System.out.println(peremeter);
        return peremeter;

    }


}
