package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	/* SimpleCalculator calculate=new SimpleCalculator();
	calculate.setFirstNumber(5.0);
	calculate.setSecondNumber(4);

	System.out.println("Addition is: " + calculate.getAdditionResult());
        System.out.println("Subtraction is: " + calculate.getSubtractionResult());

        calculate.setFirstNumber(5.25);
        calculate.setSecondNumber(0);

        System.out.println("Multipication is: " + calculate.getMultiplicationResult());
        System.out.println("Division is: " + calculate.getDivisionResult());

	Person p=new Person();
	p.setFirstName("");
	p.setLastName("");
	p.setAge(5);

	System.out.println("FullName is : " +p.getFullName());
        System.out.println("Teen is : " +p.isTeen());
        System.out.println("Age is: " + p.getAge());
        p.setFirstName("John");
        p.setAge(18);

        System.out.println("FullName is : " +p.getFullName());
        System.out.println("Teen is : " +p.isTeen());

        p.setLastName("Smith");
        System.out.println("FullName is : " +p.getFullName());

	Wall w= new Wall(5,4);
	System.out.println("Area is: "+ w.getArea());

	w.setHeight(-1.5);
	System.out.println("Width is: " + w.getWidth());
	System.out.println("Height is: "+ w.getHeight());
	System.out.println("Area is: " + w.getArea());
	Point first=new Point(6,5);
	Point second=new Point(3,1);

	System.out.println("distance(0,0) : " + first.distance(0,0));
		System.out.println("distance(second) : " +first.distance(second));
		System.out.println("distance(2,2) : " + first.distance(2,2));

		Point point=new Point();
		System.out.println("distance() : " + point.distance());
		System.out.println("distance(second1) : " + Math.sqrt((6-3)*(6-3)+(5-1)*(5-1)));
	Carpet carpet=new Carpet(3.5);
	System.out.println("Cost= "+ carpet.getCost());
	Floor floor=new Floor(2.75,4.0);
	System.out.println("area= "+ floor.getArea());
	Calculator cal=new Calculator(floor,carpet);
	System.out.println("total = "+ cal.getTotalCost());
	carpet=new Carpet(1.5);
	floor =new Floor(5.4,4.5);
	cal=new Calculator(floor,carpet);
	System.out.println("total = "+ cal.getTotalCost());

	ComplexNumber one=new ComplexNumber(1.0,1.0);
	ComplexNumber number=new ComplexNumber(2.5,-1.5);
	one.add(1,1);
	System.out.println("Real: "+ one.getReal());
	System.out.println("Imaginary: "+ one.getImaginary());
	one.subtract(number);
		System.out.println("Real: "+ one.getReal());
		System.out.println("Imaginary: "+ one.getImaginary());
	number.subtract(one);
		System.out.println("Real: "+ number.getReal());
		System.out.println("Imaginary: "+ number.getImaginary());

	Circle circle=new Circle(3.75);
	System.out.println("circle.radius= "+ circle.getRadius());
	System.out.println("circle.area= "+ circle.getArea());

	Cylinder cylinder=new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= "+ cylinder.getRadius());
        System.out.println("cylinder.height= "+ cylinder.getHeight());
        System.out.println("cylinder.area= "+ cylinder.getArea());
        System.out.println("cylinder.volume= "+ cylinder.getVolume());

	Rectangle r=new Rectangle(5,10);
	System.out.println("rectangle.width= "+ r.getWidth());
	System.out.println("rectangle.length= "+ r.getLength());
	System.out.println("rectangle.area= "+ r.getArea());
	Cuboid c= new Cuboid(5,10,5);
        System.out.println("Cuboid.width= "+ c.getWidth());
        System.out.println("Cuboid.length= "+ c.getLength());
        System.out.println("Cuboid.area= "+ c.getArea());
        System.out.println("Cuboid.height= "+ c.getHeight());
        System.out.println("Cuboid.volume= "+ c.getVolume());*/
       Wall wall1=new Wall("West");
        Wall wall2=new Wall("East");
        Wall wall3=new Wall("South");
        Wall wall4=new Wall("North");

        Ceiling ceiling=new Ceiling(12,55);
        Bed bed=new Bed("Modern",4,3,2,1);
        Lamp lamp=new Lamp("Classic",false,75);
        Bedroom bedroom=new Bedroom("Preeti Rawat", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }

}
