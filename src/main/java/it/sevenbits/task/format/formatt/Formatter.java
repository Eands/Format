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
        char nowSymbol;
        boolean openBracket = false;
        int c;
        int numBracket = 0;
        boolean tabCharacter = false;
        try {

            while((c = reader.read()) != -1) {
                nowSymbol = (char)c;

                switch (nowSymbol) {
                    case '{':
                        tabCharacter = true;
                        numBracket++;
                        writer.write(' ');
                        writerBracket(nowSymbol, writer, numBracket);
                        openBracket = true;
                        break;
                    case ';':
                        tabCharacter = true;
                        if (openBracket) {
                            writerSpace(nowSymbol, writer, numBracket);
                        } else {
                            writerSemicolon(nowSymbol, writer);
                        }
                        break;
                    case '}':
                        tabCharacter = true;
                        numBracket--;
                        openBracket = false;
                        writerClosedBracket(nowSymbol, writer);
                        break;
                    case '\n':
                        break;
                    case '\r':
                        break;
                    case ' ':
                        if(tabCharacter == false)
                            writer.write(nowSymbol);
                        break;
                    default:
                        tabCharacter = false;
                        writer.write(nowSymbol);
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
    private void writerBracket(final char symbol, final IWriter writer, final int num) {
        writer.write(symbol);
        writer.write('\n');
        for(int i = 0; i < (num * 4); i++) {
            writer.write(' ');
        }
    }

    private void writerClosedBracket(final char symbol, final IWriter writer) {
        writer.write(symbol);
        writer.write('\n');
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private void writerSpace(final char symbol, final IWriter writer,int num) {
        writer.write(symbol);
        writer.write('\n');
        for(int i = 0; i < (num * 4); i++) {
            writer.write(' ');
        }
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private  void writerSemicolon(final char symbol, final IWriter writer){
        writer.write(symbol);
        writer.write('\n');
    }
}
