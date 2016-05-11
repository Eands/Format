package it.sevenbits.task.format.recordFile;

import java.io.*;

public class Recod {
    void record(){
        File outFile = new File("outtext.txt");
        try {
            OutputStream outputFileStream = new FileOutputStream(outFile);
            Writer fileWriter = new OutputStreamWriter(outputFileStream, "utf-8");
            PrintWriter printWriter = new PrintWriter(fileWriter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
