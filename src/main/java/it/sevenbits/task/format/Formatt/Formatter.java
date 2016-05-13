package it.sevenbits.task.format.Formatt;

import it.sevenbits.task.format.recordFile.IWriter;
import it.sevenbits.task.format.readFile.IReader;

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
    public void format(final IReader reader,final IWriter writer){
        char nowsymbol;
        boolean s=false;

        try{
            int c;
            while((c=reader.read())!= -1) {
            nowsymbol = (char)c;
                switch (nowsymbol) {
                    case '{':
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
                        writer.write(nowsymbol);
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
    private void writerBracket(char symbol, final IWriter writer) {
        writer.write(symbol);
        writer.write('\n');
        for(int i=0;i<4;i++) {
            writer.write(' ');
        }
    }

    /**
     *
     * @param symbol the desired character
     * @param writer write to file
     */
    private void writerSpace(char symbol, final IWriter writer){
        writer.write(symbol);
        writer.write('\n');
        for(int i=0;i<4;i++) {
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
