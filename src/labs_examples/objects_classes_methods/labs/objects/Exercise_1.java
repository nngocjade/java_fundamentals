package labs_examples.objects_classes_methods.labs.objects;

/**
 * Following the example in CarExample.java, please use Object Composition to model an Airplane class.
 * The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
 * The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
 * We'll use these a bit later.
 */

class Exercise_1{

    public static void main(String[] args) {

        Model model = new Model("Boeing", 747, "Delta");
        FuelCap fuelCapacity = new FuelCap(26000.00);
        CurrentFuelLevel currentFuelLevel = new CurrentFuelLevel(10000.00);
        AEngine engine = new AEngine(400);
        Airplane myAirplane = new Airplane ();

        System.out.println("My frequent flyer is " + " , " + myAirplane.make + " , " + myAirplane.model +  "with a tank size of" + myAirplane.FuelCap);
    }

}

class Airplane {

    int make;
    Model model;
    Double FuelCap;
    Double currentFuelLevel;
    AEngine aEngine;


    public Airplane(int make, Model model, Double fuelCap, Double currentFuelLevel, AEngine aEngine) {
        this.make = make;
        this.FuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.model = model;
        this.aEngine = aEngine;
    }

        @Override
        public String toString() {
            return "Airplane{" +
                    "engine=" + make +
                    ",\n FuelCap=" + FuelCap.toString() +
                    ",\n currentFuelLevel=" + currentFuelLevel.toString() +
                    ",\n model='" + model.toString() +
                    ",\n aEngine='" + aEngine.toString() +
                    '}';
        }

}

class Make {
    int year;

    public Make(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make {" +
                "year = " + year +
                '}';
    }


}

class Model {
    String name;
    int series;
    String brand;

    public Model(String name, int series, String brand){
        this.name = name;
        this.series = series;
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Model {" +
                "name = " + name +
                "series = " + series +
                "brand = " + brand +
                '}';
    }


}

class FuelCap {
    double tankSizeInLiters;

    public FuelCap(double tankSize){
        this.tankSizeInLiters = tankSizeInLiters;

    }
    @Override
    public String toString() {
        return "FuelCap {" +
                "tankSize = " + tankSizeInLiters +
                '}';
    }
}

class CurrentFuelLevel {
    double currentLevel;
    public CurrentFuelLevel(double currentLevel){
        this.currentLevel = currentLevel;

    }
    @Override
    public String toString() {
        return "currentFuelLevel {" +
                "currentLevel = " + currentLevel +
                '}';
    }

}

class AEngine {
    double horsePower;
    public AEngine(double horsePower){
        this.horsePower = horsePower;

    }
    @Override
    public String toString() {
        return "AEngine {" +
                "horsePower = " + horsePower +
                '}';
    }

}

