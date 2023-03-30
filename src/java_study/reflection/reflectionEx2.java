package java_study.reflection;


import java.lang.reflect.Field;

public class reflectionEx2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("java_study.reflection.Student");

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }

    }
}
