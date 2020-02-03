package labs_examples.input_output.labs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
        String fileReadPath = "src/labs_examples/input_output/files/byte_data";
        String fileWritePath = "src/labs_examples/input_output/files/byte_data_copy";

        byteByByte(fileReadPath);

    }
    public static void byteByByte(String fileReadPath) throws IOException {

        //try with resources
        try (FileInputStream in = new FileInputStream(fileReadPath)) {
            // initialize them within the Try in case the files do not exist or cannot be accessed
            int c;
            // InputStream's read() method returns -1 when the end of the file is reached
            while ((c = in.read()) != -1) {
                // write the data (byte by byte) to console
                System.out.print((char) c);
            }
        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());
        }
    }
    //with buffer
    public static void byte2(String fileReadPath, String fileWritePath) throws IOException{

        try(FileInputStream in = new FileInputStream(new File(fileReadPath));
            FileOutputStream out = new FileOutputStream((new File(fileWritePath)))){

        }
    }
    public static void character1(){

    }
    //with buffer
    public static void character2(){

    }
    public static void dataInputOutput(){

    }
        }