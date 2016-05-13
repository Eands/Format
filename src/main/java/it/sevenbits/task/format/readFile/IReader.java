package it.sevenbits.task.format.readFile;

import java.io.IOException;

/**
 * reader interface
 */
public interface IReader {
    /**
     *
     * @return reading
     * @throws IOException
     */
    public int read() throws IOException;

    /**
     * closing thread
     */
    public void close();
}
