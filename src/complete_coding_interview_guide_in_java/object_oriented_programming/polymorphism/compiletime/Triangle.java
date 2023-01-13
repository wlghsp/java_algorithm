package complete_coding_interview_guide_in_java.object_oriented_programming.polymorphism.compiletime;

public class Triangle {

    public void draw() {
        System.out.println("Draw default triangle ...");
    }

    public void draw(String color) {
        System.out.println("Draw a triangle of color " + color);
    }

    public void draw(int size, String color) {
        System.out.println("Draw a triangle of color " + color +
                " and scale it up with the new size of " + size);
    }
}
