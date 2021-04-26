package academy.learnprogramming;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden: startEngine() method called ";
    }

    @Override
    public String accelerate() {
        return "Holden: accelerate() method called";
    }

    @Override
    public String brake() {
        return "Holden:  brake() method called";
    }
}
