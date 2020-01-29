package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try{
            inputStream = new FileInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {


    }
}