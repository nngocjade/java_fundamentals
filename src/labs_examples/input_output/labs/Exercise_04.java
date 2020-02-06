package labs_examples.input_output.labs;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise_4{
    public static void main(String[] args) {

    }
}

//POJO
class Elephant{
    private String name;
    private String personality;
    private int age;
    private double weight;

    public Elephant(String name, String personality, int age, double weight) {
        this.name = name;
        this.personality = personality;
        this.age = age;
        this.weight = weight;
    }
    public Elephant(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}