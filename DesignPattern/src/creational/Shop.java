package creational;

public class Shop {

    public static void main(String[] args) {
        Phone newPhone = new PhoneBuilder().
                setOs("Apple").setRam(2).
                setScreenSize(5.6).getPhone();
        System.out.println(newPhone);
    }
}