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

        String fileReadPath = "src/labs_examples/input_output/files/char_data_copy.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_rewrite.txt";

        FileInputStream fin = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fout = null;
        BufferedOutputStream bufferedOutputStream = null;

        //Copy a File.
        try{
            //Attempt to open the files
            fin = new FileInputStream(fileReadPath);
            bufferedInputStream = new BufferedInputStream(fin);
            fout = new FileOutputStream(fileWritePath);
            bufferedOutputStream = new BufferedOutputStream(fout);


            //holds collection of bytes to read at once
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                bufferedOutputStream.write(bytesRead);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                fin.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

//    BufferedInputStream fin = new BufferedInputStream(new FileInputStream("in.dat"));
//    BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("out.dat"));
//    int i;
//    do {
//            i = fin.read();
//            if (i != -1)
//            fout.write(i);
//            } while (i != -1);
//            fin.close();
//            fout.close();
//            }