package reflection_method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Method[] methods = c.getDeclaredMethods();

        StringBuffer sb = new StringBuffer();

        sb.append(Modifier.toString(c.getModifiers()) +" class "+c.getSimpleName()+" { \n");

        for (Method m : methods) {
            sb.append("\t");
            sb.append(Modifier.toString(m.getModifiers())+" ");
            sb.append(m.getReturnType().getSimpleName()+" ");
            sb.append(m.getName()+"");
            sb.append("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            /*for (Class<?> type : parameterTypes) {
                sb.append(type);
                sb.append(",");
            }*/
            for(int i = 0;i<parameterTypes.length;i++){
                sb.append(parameterTypes[i].getSimpleName());
                if((i+1)!=parameterTypes.length)
                    sb.append(",");
            }
            sb.append("){}\n");

        }

        sb.append("}");
        System.out.println(sb);
    }
}
