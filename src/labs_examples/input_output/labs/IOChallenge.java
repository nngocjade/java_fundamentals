package labs_examples.input_output.labs;

//download this file

import java.io.*;
import java.sql.Ref;
import java.util.ArrayList;

//1. save it to a directory within your CodingNomads directory
//2. then write an application with a method called readData() that will read this file using a BufferedReader
//3. map each row in this file to a custom POJO you create
//4. add each new object to an ArrayList of said objects
//5. return the arraylist from readData
//6. in the main() method, print out the the status of each object with the toString() method
//Bonus Tasks: which country has the highest refugees per capita? which has the lowest? What is the average number of refugees in all countries? What is the avg number of population for all countries? etc etc
//another bonus question: how many countries start with each letter of the alphabet? for instance:
//9 countries start with "a"
//13 countries start with "b"
//...
//but determine this in code
public class IOChallenge {
    static String filePath = "src/labs_examples/input_output/labs/refugees_per_capita.csv";

    public static void main(String[] args) {

        ArrayList<Refugee> refugee = null;
        try {
            bufferedReaderMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Refugee r : refugee){
            System.out.println(r.toString());
        }


    }
    public static void bufferedReaderMethod() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        int val = 0;
        byte[] buffer = new byte[4];
        while((val = bis.read(buffer)) != -1){
            for(byte b : buffer){
                System.out.print((char)b);
            }
        }
    }
    public static ArrayList<Refugee> readData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));

        ArrayList<Refugee> refugee = new ArrayList<>();

        String val = "";
        // read off the first line (the headers) and do nothing with it
        br.readLine();
        while((val = br.readLine()) != null){

            //id,Year,Country,Population,Refugees,RefPerCap

            String[] elements = val.split(",");

            int id = Integer.parseInt(elements[0]);
            int year = Integer.parseInt(elements[1]);
            String country = elements[2];
            double population = Double.parseDouble(elements[3]);
            double refugees = Double.parseDouble(elements[3]);
            double refPerCap = Double.parseDouble(elements[3]);

            Refugee r = new Refugee(id, year, country, population, refugees, refPerCap);
            refugee.add(r);
        }
        return refugee;
    }
}
