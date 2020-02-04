package labs_examples.input_output.labs;

import java.io.*;

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
    public static void main(String[] args) {
        String fileReadPath = "src/labs_examples/input_output/files/byte_data";
        String fileWritePath = "src/labs_examples/input_output/files/byte_data_copy";
        String fileReadPath1 = "src/labs_examples/input_output/files/char_data_2.txt";
        String fileReadPath2 = "src/labs_examples/input_output/files/char_data_2.txt";
        String fileWritePath2 = "src/labs_examples/input_output/files/char_data_2.txt";

        try{
            bytePrintToConsole(fileReadPath);
        }catch (IOException e){
            System.out.println("error detected: " + e.getMessage());
        }
        System.out.println("\n");
        try{
            byteReadWriteBuffer(fileReadPath,fileWritePath);
        }catch(IOException e){
            System.out.println("error detected: " + e.getMessage());
        }
        System.out.println("\n");
        try{
            characterPrintToConsole(fileReadPath1);
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
    public static void byteReadWriteBuffer(String fileReadPath, String fileWritePath) throws IOException {

        FileInputStream in = new FileInputStream(fileReadPath);
        FileOutputStream out = new FileOutputStream(fileWritePath);

        int i;

        try {
            BufferedInputStream fin = new BufferedInputStream(in);
            BufferedOutputStream fout = new BufferedOutputStream(out);

            byte[] buffer = new byte[3];

            while ( (i = fin.read(buffer)) != -1) {
                fout.write((char) i);
            }
        } finally {
            in.close();
            out.close();
        }

        }
    public static void characterPrintToConsole(String fileReadPath1) throws IOException{

        try(FileReader in = new FileReader(fileReadPath1)){

            char c;
            do {
                c = (char) in.read();
                System.out.print(c);
            }while (c != '!');
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //with buffer
    public static void characterReadWriteBuffer(){

    }
    public static void dataInputOutput(){

    }
        }