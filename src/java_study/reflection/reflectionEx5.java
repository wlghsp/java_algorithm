package java_study.reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectionEx5 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> c = Class.forName("java_study.reflection.Student1");

        Method m = c.getMethod("printName");

        Student2 student2 = new Student2();

        Object obj = m.invoke(student2);

        System.out.println("obj = " + (String) obj);
    }
}
