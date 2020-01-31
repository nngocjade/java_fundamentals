package labs_examples.input_output.labs;

import java.io.*;
import java.nio.CharBuffer;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_2{
    public static void main(String[] args) throws IOException {
        //passing in file
        String fileReadPath = "src/labs_examples/input_output/files/char_data_copy.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        readCharByChar(fileReadPath,fileWritePath);

    }
    public static void readCharByChar(String fileReadPath, String fileWritePath) throws IOException{
        //pass the path to the file as  parameter
        BufferedReader br = new BufferedReader(new FileReader(fileReadPath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileWritePath));

        //temp i variable
        int i ;
        //initialization inside while loop
        while ((i = br.read()) != -1) {
            //write to new file
            bw.write(fileWritePath.replace("a","-"));
        }
    }
}