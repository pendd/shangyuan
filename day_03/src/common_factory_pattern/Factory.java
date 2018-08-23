package common_factory_pattern;

public class Factory {
    Usb produce(String type){
        if(type.equals("TypeUsb"))
            return new TypeUsb();
        else if (type.equals("IphoneUsb"))
            return new IphoneUsb();
        else{
            System.out.println("没有匹配的类型");
            return null;
        }

    }

    public static void main(String[] args) {
        Factory fa = new Factory();
        fa.produce("TypeUsb").print();
        fa.produce("IphoneUsb").print();
    }
}
