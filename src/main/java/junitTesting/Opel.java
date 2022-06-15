package junitTesting;

public class Opel {

        private final Car car;

    public Opel(Car car) {
        this.car = car;
    }

    public String sampleMethod(){
            Car car=new Car("Opel", "Mokka", 5);
        return car.message("This is Mokka!!!");
    }
}
