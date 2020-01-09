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
        Make make = new Make ( 2012);
        FuelCap fuelCap = new FuelCap(26000.00);
        AEngine engine = new AEngine(400);
        Airplane myAirplane = new Airplane (model, make, fuelCap, 10000.00, engine);

        System.out.println("My frequent flyer is " + myAirplane.model.name + " " + myAirplane.model.series + " , made in the year of - " + myAirplane.make +  ", with a tank size of " + myAirplane.fuelCap.tankSizeInLiters + " liters and a " +myAirplane.aEngine.horsePower + " engine.");
        System.out.println("\n");
        System.out.println(myAirplane.toString());
    }
}

class Airplane {

    Model model;
    Make make;
    FuelCap fuelCap;
    Double currentFuelLevel;
    AEngine aEngine;

    public Airplane(Model model, Make make, FuelCap fuelCap, Double currentFuelLevel, AEngine aEngine) {
        this.make = make;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.model = model;
        this.aEngine = aEngine;
    }

        @Override
        public String toString() {
            return "Airplane {" +
                    ",\n model = " + model.toString() +
                    ",\n make = " + make +
                    ",\n fuelCap = " + fuelCap.toString() +
                    ",\n currentFuelLevel = " + currentFuelLevel.toString() +
                    ",\n aEngine = " + aEngine.toString() +
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
                " name = " + name +
                " series = " + series +
                " brand = " + brand +
                '}';
    }
}
class FuelCap {
    double tankSizeInLiters;

    public FuelCap(double tankSizeInLiters){
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

