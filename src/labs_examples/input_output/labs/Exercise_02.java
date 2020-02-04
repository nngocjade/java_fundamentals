package labs_examples.input_output.labs;

import java.io.*;


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
        //passing in file
        String fileReadPath = "src/labs_examples/input_output/files/char_data_copy.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        //temp st variable
        String st ;

        //declaring and initializing files
        try (BufferedReader br = new BufferedReader(new FileReader(new File (fileReadPath)));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File (fileWritePath)))) {
            //while end of file is not reached
            while ((st = br.readLine()) != null) {
                //write to new file and replace "a" with "-" and "e" with "~"
                bw.write((st.replaceAll("a", "-").replaceAll("e","~")));
                //line by line
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //reading back encrypted file
        try (BufferedReader brNew = new BufferedReader(new FileReader(new File(fileWritePath)))){
            //while end of file is not reached
            while ((st = brNew.readLine()) != null) {
                //print encrypted file to console
                System.out.println(st);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}