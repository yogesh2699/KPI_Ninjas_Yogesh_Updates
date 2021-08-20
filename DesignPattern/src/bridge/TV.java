package bridge;

/* Structural  Design Patterns : Bridge Design Pattern*/

abstract class TV {
    Remote remote;

    TV(Remote r) {
        this.remote = r;
    }
    abstract void on();
    abstract void off();
}

class Sony extends TV{
    Remote remoteType;
    Sony(Remote r)
    {
          super(r);
          this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Sony TV ON");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Sony TV OFF");
        remoteType.off();
    }
}

class Philips extends TV{
    Remote remoteType;
    Philips(Remote r){
        super(r);
        this.remoteType = r;
    }
    @Override
    void on() {
        System.out.println("Philips TV ON");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Philips TV OFF");
        remoteType.off();
    }
}

interface Remote{
    public void on();
    public void off();
}

class OldRemote implements Remote{

    @Override
    public void on() {
        System.out.println("ON with Old Remote");
    }

    @Override
    public void off() {
      System.out.println("OFF with old Remote");
    }
}

class NewRemote implements Remote{

    @Override
    public void on() {
        System.out.println("ON with New Remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with New Remote");
    }
}

 class Client{
    public static void main(String[] args) {
        TV sonyOldRemote = new Sony(new OldRemote());
        sonyOldRemote.on();
    }
}