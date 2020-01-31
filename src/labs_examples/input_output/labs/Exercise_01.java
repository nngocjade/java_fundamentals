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
        BufferedInputStream fin = new BufferedInputStream(new FileInputStream("src/labs_examples/input_output/files/char_data_copy.txt"));
        BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("src/labs_examples/input_output/files/char_data_rewrite.txt"));
        //temp variable i
        int i;
        try {
            //looping 5 bits at a time
            byte[] buffer = new byte[5];
            //while find.read(buffer) is not reaching end of file, keep looping
            while (fin.read(buffer) != -1) {
                //write charater while looping
                fout.write(buffer);
            }
            //catch any exception otherwise
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        //close once end of file is reached
        fin.close();
        fout.close();
    }

//        String fileReadPath = "src/labs_examples/input_output/files/char_data_copy.txt";
//        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";
//
//        FileInputStream fin = null;
//        BufferedInputStream bufferedInputStream = null;
//        FileOutputStream fout = null;
//        BufferedOutputStream bufferedOutputStream = null;
//
//        //Copy a File.
//        try {
//            //Attempt to open the files
//            fin = new FileInputStream(fileReadPath);
//            bufferedInputStream = new BufferedInputStream(fin);
//            fout = new FileOutputStream(fileWritePath);
//            bufferedOutputStream = new BufferedOutputStream(fout);
//
//
//            //holds collection of bytes to read at once
//            byte[] buffer = new byte[5];
//            int bytesRead = 0;
//            // this while loop will read the file 5 bytes at a time
//            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
//
//                bufferedOutputStream.write((char) bytesRead);
//            }
//        } catch (IOException exc) {
//            exc.printStackTrace();
//        } finally {
//            try {
//                if(fin != null)
//                fin.close();
//                if(bufferedInputStream != null)
//                bufferedInputStream.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//            try {
//                if(fout != null)
//                    fout.close();
//                if(bufferedOutputStream != null)
//                bufferedOutputStream.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
    }



