package labs_examples.objects_classes_methods.labs.objects;

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
        Model model = new Model("Boeing", 747, "Delta");
        Make make = new Make(2012);
        FuelCap fuelCap = new FuelCap(26000.00);
        CurrentFuelLevel  currentFuelLevel = new CurrentFuelLevel(10000);
        AEngine engine = new AEngine(400);
        Airplane myAirplane = new Airplane (model, make, fuelCap, 10000.00, engine);

        System.out.println("My frequent flyer is " + myAirplane.model.name + " " + myAirplane.model.series + " " +
                ", made in the year of - " + myAirplane.make +  ", with a tank size of " + myAirplane.fuelCap.tankSizeInLiters
                + " liters and a " +myAirplane.aEngine.horsePower + " engine.");

        System.out.println("My frequent flyer is " + Model_Exercise_4.getName() + " " + Model_Exercise_4.getSeries() +
                " , made in the year of - " + myAirplane.make +  ", with a tank size of " + myAirplane.fuelCap.tankSizeInLiters
                + " liters and a " +myAirplane.aEngine.horsePower + " engine.");
        System.out.println("\n");
        System.out.println(myAirplane.toString());
        System.out.println(model.toString());
        System.out.println(make.toString());
        System.out.println(fuelCap.toString());
        System.out.println(currentFuelLevel.toString());
        System.out.println(engine.toString());

    }
}

class Airplane_Exercise_4 {
    private Model model;
    private Make make;
    private FuelCap fuelCap;
    private Double currentFuelLevel;
    private AEngine aEngine;

    public Airplane_Exercise_4(Model model, Make make, FuelCap fuelCap, Double currentFuelLevel, AEngine aEngine) {
        this.model = model;
        this.make = make;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.aEngine = aEngine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public FuelCap getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(FuelCap fuelCap) {
        this.fuelCap = fuelCap;
    }

    public Double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(Double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public AEngine getaEngine() {
        return aEngine;
    }

    public void setaEngine(AEngine aEngine) {
        this.aEngine = aEngine;
    }

    @Override
    public String toString() {
        return "Airplane_Exercise_4{" +
                "model=" + model +
                ", make=" + make +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel=" + currentFuelLevel +
                ", aEngine=" + aEngine +
                '}';
    }
}
class Make_Exercise_4 {
    private int year;

    public Make_Exercise_4(int year) {
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
        return "Make_Exercise_4{" +
                "year=" + year +
                '}';
    }
}
class Model_Exercise_4 {
    private static String name;
    private static int series;
    private String brand;

    public Model_Exercise_4(String name, int series, String brand) {
        this.name = name;
        this.series = series;
        this.brand = brand;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSeries() {
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
        return "Model_Exercise_4{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", brand='" + brand + '\'' +
                '}';
    }
}
class FuelCap_Exercise_4 {
    private double tankSizeInLiters;

    public FuelCap_Exercise_4(double tankSizeInLiters) {
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
        return "FuelCap_Exercise_4{" +
                "tankSizeInLiters=" + tankSizeInLiters +
                '}';
    }
}
class CurrentFuelLevel_Exercise_4 {
    private double currentLevel;

    public CurrentFuelLevel_Exercise_4(double currentLevel) {
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
        return "CurrentFuelLevel_Exercise_4{" +
                "currentLevel=" + currentLevel +
                '}';
    }
}
class AEngine_Exercise_4 {
    private double horsePower;

    public AEngine_Exercise_4(double horsePower) {
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
        return "AEngine_Exercise_4{" +
                "horsePower=" + horsePower +
                '}';
    }
}
