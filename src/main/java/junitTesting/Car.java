package junitTesting;

public class Car {

    String make;
    String model;
    int numDoors;
    static int wheels;

    public Car(String make, String model, int numDoors){
        this.make=make;
        this.model=model;
        this.numDoors=numDoors;
    }

    public void printDetails (){
        System.out.println("Car make " + make + ", car model " + model + ", number of doors  " + numDoors);
    }

    public String message(String message){
        return message;
    }

}
