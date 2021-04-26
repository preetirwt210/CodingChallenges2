package academy.learnprogramming;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi: startEngine() method called ";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi: accelerate() method called";
    }

    @Override
    public String brake() {
        return "Mitsubishi:  brake() method called";
    }
}
