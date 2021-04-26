package academy.learnprogramming;

public class Car {
    private boolean engines;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engines=true;
        this.wheels=4;
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
    public String startEngine(){

        return "Car: startEngine() method called ";
    }
    public String accelerate(){
        return "Car: accelerate() method called";
    }
    public String brake(){
        return "Car:  brake() method called";
    }
}
