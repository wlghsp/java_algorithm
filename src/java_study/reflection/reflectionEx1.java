package java_study.reflection;



public class reflectionEx1 {

    public static void main(String[] args) throws ClassNotFoundException {
        // Access Student using static Student Class.
        Class<?> cls = Class.forName("java_study.reflection.Student");
        System.out.println("cls.getName() = " + cls.getName());


        Student student = new Student();
        Class<? extends Student> cls1 = student.getClass();


        Class<Student> studentClass = Student.class;
        System.out.println("studentClass = " + studentClass);

    }
}
