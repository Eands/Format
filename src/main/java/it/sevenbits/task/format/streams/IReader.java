package it.sevenbits.task.format.streams;

import java.io.IOException;


/**
 * reader interface
 */
public interface IReader {
    /**
     *
     * @return reading
     */
    int read() throws IOException;

    /**
     * closing thread
     */
    void close();
}
