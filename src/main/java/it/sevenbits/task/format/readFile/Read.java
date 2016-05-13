package it.sevenbits.task.format.readFile;

import it.sevenbits.task.format.IReader;

import java.io.*;

public class Read implements IReader{

    public char read() {
        try {
            File inputFile = new File("text.txt");
            InputStream inputFileStream = new FileInputStream(inputFile);
            Reader fileReader = new InputStreamReader(inputFileStream, "utf-8");
            BufferedReader reader = new BufferedReader(fileReader);

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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

