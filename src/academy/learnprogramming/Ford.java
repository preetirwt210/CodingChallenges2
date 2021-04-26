package academy.learnprogramming;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford: startEngine() method called ";
    }

    @Override
    public String accelerate() {
        return "Ford: accelerate() method called";
    }

    @Override
    public String brake() {
        return "Ford:  brake() method called";
    }
}
