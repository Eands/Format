package it.sevenbits.task.format.recordFile;

import java.io.*;

/**
 * write to file
 */
public class Writers implements IWriter{

private FileOutputStream outputStream;

    /**
     * write to file
     */
    public Writers() {
        try {
            outputStream = new FileOutputStream("outtext.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param symbol writeable character
     */
    public void write(char symbol) {
        try {
            outputStream.write(symbol);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * closing thread
     */
    public void close(){

        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
