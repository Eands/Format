package it.sevenbits.task.format.main;



import it.sevenbits.task.format.Formatt.Formatter;
import it.sevenbits.task.format.readFile.Read;
import it.sevenbits.task.format.recordFile.Writers;

/**
 * application entry point
 */
public class Main {
    public static void main(String [] args){
        Read read;
        Writers writer;
        Formatter formatter=new Formatter();

        read = new Read("text.txt");
        writer = new Writers("outtext.txt");
        formatter.format(read, writer);

    }


}
