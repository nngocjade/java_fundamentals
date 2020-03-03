package labs_examples.Bali_InPerson_MarApr2020.Day2_Mar_3.InputOutput.Challenge;

//download this file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
class IORefugeeChallenge {
    public static void main(String[] args) throws IOException {

        ArrayList<Refugee> refugee = new ArrayList<>();
        refugee = readData();

        for (Refugee r : refugee){
            System.out.println(r.toString());
        }

        double lowestRefPerCap = refugee.get(0).getRefPerCap();
        double highestRefPerCap = refugee.get(0).getRefPerCap();
        String lowestCountry = refugee.get(0).getCountry();
        String highestCountry = refugee.get(0).getCountry();

        for(Refugee r : refugee){
            if (r.getRefPerCap() < lowestRefPerCap){
                lowestRefPerCap = r.getRefPerCap();
                lowestCountry = r.getCountry();
            } else if (r.getRefPerCap() > highestRefPerCap){
                highestRefPerCap = r.getRefPerCap();
                highestCountry = r.getCountry();
            }
        }
        //highest refugees per capita
        System.out.println("\nThe country with the most refugee per capita is " + highestCountry +
                " with " + highestRefPerCap + " refugees per capita");
        //lowest refugees per capita
        System.out.println("\nThe country with the least refugee per capita is " + lowestCountry +
                " with " + lowestRefPerCap + " refugees per capita");

        //average # of refugee for all countries
        double avgNumRefugees = calculateAvgAge(refugee);
        System.out.println("\nThe average number of refugee for all countries " + avgNumRefugees);
        //average # of population for all countries
        double avgPop = calculateAvgPop(refugee);
        System.out.println("\nThe average number o population for all countries " + avgPop);
        // how many countries start with each letter of the alphabet? for instance:
        ////9 countries start with "a"
        ////13 countries start with "b"
    }

    private static double calculateAvgPop(ArrayList<Refugee> refugee) {
        double sum = 0;
        for (Refugee r : refugee){
            sum += r.getPopulation();
        }
        return (sum / refugee.size());
    }

    private static double calculateAvgAge(ArrayList<Refugee> refugee) {
        double sum = 0;
        for (Refugee r : refugee){
            sum += r.getRefugees();
        }
        return (sum / refugee.size());
    }

//    public static void bufferedReaderMethod() throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
//        int val = 0;
//        byte[] buffer = new byte[6];
//        while((val = bis.read(buffer)) != -1){
//            for(byte b : buffer){
//                System.out.print((char)b);
//            }
//        }
//    }

    public static void validationCheck(){

    }

    public static ArrayList<Refugee> readData() throws IndexOutOfBoundsException, IOException {

        String filePath = "src/labs_examples/Bali_InPerson_MarApr2020/Day2_Mar_3/InputOutput/Challenge/refugees_per_capita.csv";

        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));

        ArrayList<Refugee> refugee = new ArrayList<>();


        String val = "";
        // read off the first line (the headers) and do nothing with it
        br.readLine();
        while((val = br.readLine()) != null){

            //id,Year,Country,Population,Refugees,RefPerCap

            String[] elements = val.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            try{
                int id = Integer.parseInt(elements[0]);
                int year = Integer.parseInt(elements[1]);
                String country = elements[2];
                double population = Double.parseDouble(elements[3]);
                double refugees = Double.parseDouble(elements[4]);
                double refPerCap = Double.parseDouble(elements[5]);

                Refugee r = new Refugee(id, year, country, population, refugees, refPerCap);
                refugee.add(r);
            }catch (Exception e){
                continue;
            }
        }
        return refugee;
    }
}
