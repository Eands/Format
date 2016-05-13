package it.sevenbits.task.format.recordFile;

import it.sevenbits.task.format.IWriter;

import java.io.*;

public class Writer implements IWriter{
    public void writer(int symbol) {
        File outFile = new File("outtext.txt");
        try {
            OutputStream outputFileStream = new FileOutputStream(outFile);
            java.io.Writer fileWriter = new OutputStreamWriter(outputFileStream, "utf-8");
            PrintWriter printWriter = new PrintWriter(fileWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
