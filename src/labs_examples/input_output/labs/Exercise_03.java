package labs_examples.input_output.labs;

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
        String fileReadPath = "";
        String fileWritePath = "";



    }
    public static void byteByByte(String fileReadPath, String fileWritePath) throws IOException {
        // declare Input and Output Streams outside of Try statement so they're
        // accessible in the Finally statement
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // initialize them within the Try in case the files do not exist or cannot be accessed
            in = new FileInputStream(fileReadPath);
            out = new FileOutputStream(fileWritePath);
            int c;

            // while there is more data to read in the InputStream "in"
            // InputStream's read() method returns -1 when the end of the file is reached
            while ((c = in.read()) != -1) {
                // write the data (byte by byte) to the OutputStream "out"
                out.write(c);
            }
        } catch (IOException exc){
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {
            // close connections to files
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
    //with buffer
    public static void byte2(){

    }
    public static void character1(){

    }
    //with buffer
    public static void character2(){

    }
    public static void dataInputOutput(){

    }
        }