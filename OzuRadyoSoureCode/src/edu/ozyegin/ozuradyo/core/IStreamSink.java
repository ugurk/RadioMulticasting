package edu.ozyegin.ozuradyo.core;

import java.util.List;

public interface IStreamSink {
    final String NEWLINE = "\r\n";
    void write(byte[] b) throws Exception;
    void initialize(List<String> headers);
    boolean isInitialized();
    void flush();
}
