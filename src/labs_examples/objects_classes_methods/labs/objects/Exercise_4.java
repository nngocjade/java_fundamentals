package labs_examples.objects_classes_methods.labs.objects;

import labs_examples.interfaces.examples.Series;

/**
 * Building off the previous classes we created in Exercise_01
 *
 * 1) Create a toString() method in each POJO. You can do this by holding down the Control key and hitting
 * enter at the same time. If you see a small menu choose toString() and generate from there. Otherwise you can
 * select "Code" from the top most navbar of IntelliJ and then select "Generate" and choose toString();
 *
 * 2) In the main() method you created in the controller classes demonstrate creating a number of Objects using a variety
 * of constructors that you created in the previous exercise.
 *
 * 3) After creating these objects, print the status of these objects. For example:
 * System.out.println(cardObj.toString())
 */

/*Exercise 4 pretty much looks exactly like exercise 1 because I modeled after the CarExample and apparently did
 all the extra work that was meant to be done in Ex 4. If otherwise, I misunderstood the directions and that
 there is anything I was supposed to do differently please let me know! */

/*
Method's Exercise 2 is also done in this file.
- changed the instance variables in each POJO to "private"
- created getter and setter methods for each instance variable, in each class
- the to String () method was previously created already (from object exercise 1 and 4)
- demonstrated getting and setting
those variables
- invoked the instance variable's to String () methods
 */

class Exercise_4{
    public static void main(String[] args) {
        Model_Ex4 model = new Model_Ex4("Boeing", 747, "Delta");
        Make_Ex4 make = new Make_Ex4(2012);
        FuelCap_Ex4 fuelCap = new FuelCap_Ex4(26000.00);
        CurrentFuelLevel_Ex4 currentFuelLevel = new CurrentFuelLevel_Ex4(10000);
        AEngine_Ex4 engine = new AEngine_Ex4(400);
        Airplane_Ex4 myAirplane = new Airplane_Ex4 (model, make, fuelCap, currentFuelLevel, engine);


        //setter overrides value in the above objects
        model.setName("B");
        model.setSeries(667);
        model.setBrand("American Airline");

        System.out.println("My frequent flyer is " + myAirplane.getModel().getName()+ " " + myAirplane.getModel().getSeries() + " " +
                ", made in the year of - " + myAirplane.getMake().getYear() +  ", with a tank size of " + myAirplane.getFuelCap().getTankSizeInLiters()
                + " liters and a " +myAirplane.getaEngine().getHorsePower() + " engine.");
        System.out.println("\n");
        System.out.println(myAirplane.toString());
        System.out.println(model.toString());
        System.out.println(make.toString());
        System.out.println(fuelCap.toString());
        System.out.println(currentFuelLevel.toString());
        System.out.println(engine.toString());

    }
}

class Airplane_Ex4{
    private Model_Ex4 model;
    private Make_Ex4 make;
    private FuelCap_Ex4 fuelCap;
    private CurrentFuelLevel_Ex4 currentFuelLevel;
    private AEngine_Ex4 aEngine;

    public Airplane_Ex4(Model_Ex4 model, Make_Ex4 make, FuelCap_Ex4 fuelCap, CurrentFuelLevel_Ex4 currentFuelLevel, AEngine_Ex4 aEngine) {
        this.model = model;
        this.make = make;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.aEngine = aEngine;
    }

    public Model_Ex4 getModel() {
        return model;
    }

    public void setModel(Model_Ex4 model) {
        this.model = model;
    }

    public Make_Ex4 getMake() {
        return make;
    }

    public void setMake(Make_Ex4 make) {
        this.make = make;
    }

    public FuelCap_Ex4 getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(FuelCap_Ex4 fuelCap) {
        this.fuelCap = fuelCap;
    }

    public CurrentFuelLevel_Ex4 getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(CurrentFuelLevel_Ex4 currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public AEngine_Ex4 getaEngine() {
        return aEngine;
    }

    public void setaEngine(AEngine_Ex4 aEngine) {
        this.aEngine = aEngine;
    }

    @Override
    public String toString() {
        return "Airplane_Ex4{" +
                "model=" + model +
                ", make=" + make +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel=" + currentFuelLevel +
                ", aEngine=" + aEngine +
                '}';
    }
}
class Make_Ex4 {
    private int year;

    public Make_Ex4(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make_Ex4{" +
                "year=" + year +
                '}';
    }
}
class Model_Ex4 {
    private String name;
    private int series;
    private String brand;

    public Model_Ex4(String name, int series, String brand) {
        this.name = name;
        this.series = series;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Model_Ex4{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", brand='" + brand + '\'' +
                '}';
    }
}
class FuelCap_Ex4 {
    private double tankSizeInLiters;

    public FuelCap_Ex4(double tankSizeInLiters) {
        this.tankSizeInLiters = tankSizeInLiters;
    }

    public double getTankSizeInLiters() {
        return tankSizeInLiters;
    }

    public void setTankSizeInLiters(double tankSizeInLiters) {
        this.tankSizeInLiters = tankSizeInLiters;
    }

    @Override
    public String toString() {
        return "FuelCap_Ex4{" +
                "tankSizeInLiters=" + tankSizeInLiters +
                '}';
    }
}
class CurrentFuelLevel_Ex4 {
    private double currentLevel;

    public CurrentFuelLevel_Ex4(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "CurrentFuelLevel_Ex4{" +
                "currentLevel=" + currentLevel +
                '}';
    }
}
class AEngine_Ex4 {
    private double horsePower;

    public AEngine_Ex4(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "AEngine_Ex4{" +
                "horsePower=" + horsePower +
                '}';
    }
}
