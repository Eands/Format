package it.sevenbits.task.format.readFile;

import java.io.*;

public class Read {

    public void read() {
        try {
            File inputFile = new File("text.txt");
            File outFile = new File("outtext.txt");
            InputStream inputFileStream = new FileInputStream(inputFile);
            Reader fileReader = new InputStreamReader(inputFileStream, "utf-8");
            BufferedReader reader = new BufferedReader(fileReader);

            OutputStream outputFileStream = new FileOutputStream(outFile);
            Writer fileWriter = new OutputStreamWriter(outputFileStream, "utf-8");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            int symbol;
            while ((symbol = reader.read()) != -1) {
                printWriter.print((char)symbol);
                System.out.print((char)symbol);
                switch (symbol) {
                    case '{':
                        System.out.print("\n    ");
                        printWriter.print("\n    ");
                        break;
                    case ';':
                        System.out.print("\n");
                        printWriter.print("\n");
                        break;
                    case '}':
                        System.out.print("\n");
                        printWriter.print("\n");
                        break;
                }
            }
            reader.close();
            inputFileStream.close();
            fileReader.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

