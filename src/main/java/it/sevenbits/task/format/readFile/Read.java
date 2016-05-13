package it.sevenbits.task.format.readFile;

/**
 *
 */

import java.io.*;

public class Read implements IReader {
    private BufferedReader reader;
    private InputStream inputFileStream;
    private Reader fileReader;

    /**
     *
     * @param s name file
     */
    public Read(String s) {
        try {
            File inputFile = new File(s);
            inputFileStream = new FileInputStream(inputFile);
            fileReader = new InputStreamReader(inputFileStream, "utf-8");
            reader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public int read() throws IOException {
        return reader.read();
    }

    /**
     * Closing thread
     */
    public void close(){
        try {
            reader.close();
            inputFileStream.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

