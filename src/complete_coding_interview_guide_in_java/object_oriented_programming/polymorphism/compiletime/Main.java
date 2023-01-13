package complete_coding_interview_guide_in_java.object_oriented_programming.polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");
    }
}
