package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculate=new SimpleCalculator();
	calculate.setFirstNumber(5.0);
	calculate.setSecondNumber(4);

	System.out.println("Addition is: " + calculate.getAdditionResult());
        System.out.println("Subtraction is: " + calculate.getSubtractionResult());

        calculate.setFirstNumber(5.25);
        calculate.setSecondNumber(0);

        System.out.println("Multipication is: " + calculate.getMultiplicationResult());
        System.out.println("Division is: " + calculate.getDivisionResult());
    }
}
