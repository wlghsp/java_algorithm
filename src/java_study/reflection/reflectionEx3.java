package java_study.reflection;


import java.lang.reflect.Field;

public class reflectionEx3 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        try {
            Class<?> cls = Class.forName("java_study.reflection.Student");

            // Access age field of Student class
            Field field = cls.getField("age");
            Student student = new Student();
            System.out.println("age before = " + student.age);

            // Set 12 value as an age
            field.setInt(student, 12);
            System.out.println("age after = " + student.age);
        } catch (Throwable e) {
            System.err.println(e);
        }

    }
}
