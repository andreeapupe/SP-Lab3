package ro.uvt;

import ro.uvt.services.OpenCommand;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand();
        openCommand.execute();
    }
}