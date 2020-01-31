package labs_examples.input_output.labs;

import java.io.*;
import java.nio.Buffer;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws IOException {

        //try with resources
        //TODO ask ryan:
        //declaring buffered and file input stream
        String fileReadPath = "src/labs_examples/input_output/files/char_data_2.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_copy.txt";

        //temp variable i
        int i;

        try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream(fileReadPath));
             BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(fileWritePath));) {

            //looping 5 bits at a time
            byte[] buffer = new byte[5];
            //while find.read(buffer) is not reaching end of file, keep looping
            while (fin.read(buffer) != -1) {
                //write while looping
                fout.write(buffer);
            }
            System.out.println("file copied to char_data_copy");
            //catch any exception otherwise
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
