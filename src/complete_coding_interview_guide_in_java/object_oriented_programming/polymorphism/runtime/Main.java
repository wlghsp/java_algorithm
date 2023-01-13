package complete_coding_interview_guide_in_java.object_oriented_programming.polymorphism.runtime;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        triangle.draw();
        rectangle.draw();
        circle.draw();

    }
}
