package app;

public class Main {
    public static void main(String[] args) {

        DataHandler handler = new DataHandler();
        DataProvider provider = new DataProvider();
        Outputer outputer = new Outputer();
        outputer.getOutput(handler.handleData(provider.getData()));
    }
}