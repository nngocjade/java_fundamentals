package labs_examples.Bali_InPerson_MarApr2020.InputOutput.Example;

import java.io.*;
import java.util.ArrayList;

class InputOutputExamples {
    static String filePath = "src/labs_examples/input_output/labs/people.csv";
    public static void main(String[] args) throws IOException {
        //demonstrateInputStream();
        //demonstrateBufferedInputStream();
        //demonstrateCharacterStream();
        ArrayList<Person> people = demonstrateBufferedCharacterStream();
        for (Person p : people){
            System.out.println(p.toString());
        }
        int avgAge = calculateAvgAge(people);
        System.out.println("the average age of these people is " + avgAge);
    }
    private static int calculateAvgAge(ArrayList<Person> people) {
        int sum = 0;
        for (Person p : people){
            sum += p.getId();
        }
        return sum / people.size();
    }
    public static void demonstrateInputStream(){
        File f = new File(filePath);
        FileInputStream fis;
        int val;
        try {
            fis = new FileInputStream(f);
            while((val = fis.read()) != -1){
                System.out.print((char) val);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found - demonstrateInputStream()");
        } catch (IOException e) {
            System.out.println("IOException - demonstrateInputStream()");
        }
    }
    public static void demonstrateBufferedInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        int val = 0;
        byte[] buffer = new byte[4];
        while((val = bis.read(buffer, 0, buffer.length)) != -1){
            for(byte b : buffer){
                System.out.print((char)b);
            }
        }
    }
    public static void demonstrateCharacterStream() throws IOException {
        FileReader fr = new FileReader(filePath);
        int val;
        while((val = fr.read()) != -1){
            System.out.print((char) val);
        }
    }
    public static ArrayList<Person> demonstrateBufferedCharacterStream() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        ArrayList<Person> people = new ArrayList<>();
        String val = "";
        // read off the first line (the headers) and do nothing with it
        br.readLine();
        while((val = br.readLine()) != null){
            String[] elements = val.split(",");
            int id = Integer.parseInt(elements[0]);
            String name = elements[1];
            String home = elements[2];
            Person p = new Person(id, name, home);
            people.add(p);
        }
        return people;
    }
}
