package reflection_constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class StringTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");

        Constructor[] con = c.getConstructors();

        StringBuffer sb = new StringBuffer();

        //sb.append(Modifier.toString(c.getModifiers())+" "+c.getSimpleName()+"{\n");

        for (Constructor constructor : con) {
            sb.append(Modifier.toString(constructor.getModifiers())+" ");
            sb.append(c.getSimpleName()+" (");

            Class[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                sb.append(parameterTypes[i].getSimpleName());
                if (i!=parameterTypes.length-1)
                    sb.append(",");
            }
            sb.append("){}\n");
        }

        System.out.println(sb);
    }
}
