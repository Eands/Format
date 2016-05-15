package it.sevenbits.task.format.streams;

/**
 * write to a file interface
 */
public interface IWriter {
    /**
     *
     * @param symbol writeable character
     */
    void write(char symbol);

    /**
     * closing thread
     */
    void close();
}
