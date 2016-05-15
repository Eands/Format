package it.sevenbits.task.format.formatt;

import it.sevenbits.task.format.streams.IWriter;
import it.sevenbits.task.format.streams.IReader;

import java.io.IOException;

/**
 * tab creation
 */
public class Formatter {
    /**
     *
     * @param reader stream file read
     * @param writer stream file writer
     */
    public void format(final IReader reader, final IWriter writer) {
        char nowsymbol;
        boolean s = false;

        try {
            int c;
            while((c = reader.read()) != -1) {
            nowsymbol = (char)c;
                switch (nowsymbol) {
                    case '{':
                        writer.write(' ');
                        writerBracket(nowsymbol, writer);
                        s = true;
                        break;
                    case ';':
                        if (s) {
                            writerSpace(nowsymbol, writer);
                        } else {
                            writerSemicolon(nowsymbol, writer);
                        }
                        break;
                    case '}':
                        s = false;
                        writerClosedBracket(nowsymbol, writer);
                        writer.write('\n');
                        break;
                    default:
                        writer.write(nowsymbol);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private void writerBracket(final char symbol, final IWriter writer) {
        writer.write(symbol);
        writer.write('\n');
        for(int i = 0; i < 4; i++) {
            writer.write(' ');
        }
    }

    private void writerClosedBracket(final char symbol, final IWriter writer) {
        writer.write('\n');
        writer.write(symbol);
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private void writerSpace(final char symbol, final IWriter writer) {
        writer.write(symbol);
        writer.write('\n');
        for(int i = 0; i < 4; i++) {
            writer.write(' ');
        }
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private  void writerSemicolon(char symbol, final IWriter writer){
        writer.write(symbol);
        writer.write('\n');
    }
}
