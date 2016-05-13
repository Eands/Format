package it.sevenbits.task.format;

import it.sevenbits.task.format.recordFile.Writer;

public class Formatter {
    public void format(IReader reader, IWriter writer, int symbol){
        new Writer();
        switch (symbol) {
            case '{':
                System.out.print("\n    ");
                writer.writer((char)symbol);//.print("\n    ");
                break;
            case ';':
                System.out.print("\n");
                writer.writer((char)symbol);//.print("\n");
                break;
            case '}':
                System.out.print("\n");
                writer.writer((char)symbol);//.print("\n");
                break;
        }
    }
}
