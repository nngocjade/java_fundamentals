package labs_examples.input_output.labs;

import java.io.*;
import java.nio.Buffer;



/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class Exercise_3{
    public static void main(String[] args) throws IOException {
        //used
        String fileReadPath = "src/labs_examples/input_output/files/byte_data";
        //used
        String fileReadPath0 = "src/labs_examples/input_output/files/byte_data_0.txt";
        //used
        String fileWritePath = "src/labs_examples/input_output/files/byte_data_copy.txt";
        //used
        String fileReadPath1 = "src/labs_examples/input_output/files/char_data_2.txt";
        //used
        String fileReadPath2 = "src/labs_examples/input_output/files/char_data_3.txt";
        //used
        String fileWritePath2 = "src/labs_examples/input_output/files/char_data_3_copy.txt";

        try{
            bytePrintToConsole(fileReadPath);
        }catch (IOException e){
            System.out.println("error detected: " + e.getMessage());
        }
        System.out.println("\n");
        try{
            byteReadWriteBuffer(fileReadPath0,fileWritePath);
        }catch(IOException e){
            System.out.println("error detected: " + e.getMessage());
        }
        System.out.println("\n");
        try{
            characterPrintToConsole(fileReadPath1);
        }catch (IOException e){
            System.out.println("error detected: " + e.getMessage());
        }
        try{
            characterReadWriteBuffer(fileReadPath2, fileWritePath2);
        }catch (IOException e){
            System.out.println("error detected: " + e.getMessage());
        }

    }
    public static void bytePrintToConsole(String fileReadPath) throws IOException {

        //try with resources
        try (FileInputStream in = new FileInputStream(fileReadPath)) {
            // initialize them within the Try in case the files do not exist or cannot be accessed
            int c;
            // InputStream's read() method returns -1 when the end of the file is reached
            while ((c = in.read()) != -1) {
                // write the data (byte by byte) to console
                System.out.print((char) c);
            }
        }
    }
    //with buffer
    public static void byteReadWriteBuffer(String fileReadPath0, String fileWritePath) throws IOException {

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileReadPath0));
            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fileWritePath))){
        //TODO: ask ryan: don't know why or how its not writing to fileWritePath

        byte[] buffer = new byte[3];

        while ((bin.read(buffer)) != -1) {
            bout.write(buffer);
        }
        }
    }
    public static void characterPrintToConsole(String fileReadPath1) throws IOException{

        try(FileReader in = new FileReader(fileReadPath1)){

            char c;
            do {
                c = (char) in.read();
                System.out.print(c);
            }while (c != '!');
        }
    }
    //with buffer
    public static void characterReadWriteBuffer(String fileReadPath2, String fileWritePath2) throws IOException{

        BufferedReader br = null;
        PrintWriter bw = null;

        try{
            br = new BufferedReader(new FileReader(fileReadPath2));
            bw = new PrintWriter(new FileWriter(fileWritePath2));
            String st;

            while ((st = br.readLine()) != null){
                bw.println(st);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (br != null)
                br.close();
            }catch (IOException e){
                System.out.println("error detected");
            }
            if (bw != null)
            bw.close();
        }
    }
    public static void dataInputOutput(){

    }
        }