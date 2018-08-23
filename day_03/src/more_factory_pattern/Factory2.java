package more_factory_pattern;

public class Factory2 {
    public Usb produceTypeC(){return new TypeUsb();}
    public Usb produceIphoneUsb(){return new IphoneUsb();}

    public static void main(String[] args) {
        new Factory2().produceIphoneUsb().print();
        new Factory2().produceTypeC().print();
    }
}
