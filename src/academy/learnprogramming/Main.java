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
        System.out.println("FullName is : " +p.getFullName());*/

	Wall w= new Wall(5,4);
	System.out.println("Area is: "+ w.getArea());

	w.setHeight(-1.5);
	System.out.println("Width is: " + w.getWidth());
	System.out.println("Height is: "+ w.getHeight());
	System.out.println("Area is: " + w.getArea());
    }

}
