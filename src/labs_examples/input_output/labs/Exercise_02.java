package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
    public static void main(String[] args) {
        String filePath = "";
    }
    public static void readCharByChar(String filePath) throws IOException{
        //pass the path to the file as  parameter
        FileReader fr = new FileReader(filePath);

        //temp i variable
        int i ;
        //initialization inside while loop
        while ((i = fr.read()) != -1)
            //casting int to char in print line
            System.out.println((char) i);
    }
    public static void readLineByLine(String filePath) throws IOException {
        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));


    }
}