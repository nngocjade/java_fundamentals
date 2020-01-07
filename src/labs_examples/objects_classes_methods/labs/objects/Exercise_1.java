package labs_examples.objects_classes_methods.labs.objects;

/**
 * Following the example in CarExample.java, please use Object Composition to model an Airplane class.
 * The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
 * The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
 * We'll use these a bit later.
 */

class Exercise_1{

}







class Airplane {

    Make make;
    Model model;
    Double FuelCap;
    Double currentFuelLevel;
    AEngine aEngine;


    public void Airplane(Make make, Model model, Double fuelCapacity, Double currentFuelLevel, AEngine aEngine) {
        this.make = make;
        this.FuelCap = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.model = model;
        this.aEngine = aEngine;
    }

        @Override
        public String toString() {
            return "Airplane{" +
                    "engine=" + make.toString() +
                    ",\n capacity=" + FuelCap.toString() +
                    ",\n capacity=" + currentFuelLevel.toString() +
                    ",\n model='" + model.toString() +
                    ",\n aEngine='" + aEngine.toString() +
                    '}';
        }

}

class Make {
    double year;

    public Make(double year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make{" +
                "year =" + year +
                '}';
    }


}

class Model {
    double series;

    public Model(double series){
        this.series = series;

    }

    @Override
    public String toString() {
        return "Model{" +
                "series =" + series +
                '}';
    }


}

class FuelCap {
    double tankSize;

    public FuelCap(double tankSize){
        this.tankSize = tankSize;

    }
    @Override
    public String toString() {
        return "FuelCap{" +
                "tankSize =" + tankSize +
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
        return "currentFuelLevel{" +
                "currentLevel =" + currentLevel +
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
        return "AEngine{" +
                "horsePower=" + horsePower +
                '}';
    }

}

