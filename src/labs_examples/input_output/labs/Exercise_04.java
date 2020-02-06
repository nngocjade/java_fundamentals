package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
    public static void main(String[] args) throws IOException {

        ArrayList<Elephant> elephants = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/elephants.csv";

        try(BufferedReader br =
                    new BufferedReader(new FileReader(filePath))){

            String line;

            while ((line = br.readLine()) != null){
                //split the line of text on " , "
                String[] values = line.split(",");
                elephants.add(mapValueToElephantObject(values));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        for(Elephant elephant : elephants){
            System.out.println(elephant.toString());
        }

    }
    private static Elephant mapValueToElephantObject(String[] values){

        Elephant elephant = new Elephant();

        elephant.setName((values[0]));
        elephant.setPersonality(values[1]);
        elephant.setAge(Integer.parseInt(values[2]));
        elephant.setWeight(Double.parseDouble(values[3]));

        return elephant;
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

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", personality='" + personality + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}