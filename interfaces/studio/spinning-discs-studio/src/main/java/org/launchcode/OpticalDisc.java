package org.launchcode;

public interface OpticalDisc {

    void writeFile(File file);

    void removeFile(File file);

    void reformatDisc();

    void runFile(File file);
}
