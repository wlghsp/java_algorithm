package java_study.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionEx4 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> c = Class.forName("java_study.reflection.Student1");

        Method[] methods = c.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {

            // Get method details
            System.out.println("methods[i].to = " + methods[i].toString());

            // Get method's class name
            System.out.println("methods[i].getDeclaringClass() = " + methods[i].getDeclaringClass());

            // Get parameter type.
            System.out.println("methods[i].getParameterTypes().toString() = " + methods[i].getParameterTypes().toString());

            // Get return type
            System.out.println("methods = " + methods[i].getReturnType());


        }
    }
}
