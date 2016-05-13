package it.sevenbits.task.format.recordFile;

/**
 * write to a file interface
 */
public interface IWriter {
    /**
     *
     * @param symbol writeable character
     */
    public void write(char symbol);

    /**
     * closing thread
     */
    public void close();
}
