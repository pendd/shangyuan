import java.lang.reflect.Field;

public class FieldDemo {

    public static void main(String[] args) throws NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {

        SampleClass sampleObject = new SampleClass();

        Field field = SampleClass.class.getField("sampleField");

            System.out.println(field.getInt(sampleObject));

    }
}

class SampleClass {
    public static int sampleField = 500;
}