package creational;

public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double ScreenSize;

    public Phone(String os, int ram, String processor, double screenSize) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        ScreenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", ScreenSize=" + ScreenSize +
                '}';
    }
}
