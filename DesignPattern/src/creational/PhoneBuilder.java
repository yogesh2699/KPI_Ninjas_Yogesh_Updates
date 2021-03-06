package creational;

/* creational design pattern : builder design pattern*/

public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private double ScreenSize;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        ScreenSize = screenSize;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(os,ram,processor,ScreenSize);
    }
}
