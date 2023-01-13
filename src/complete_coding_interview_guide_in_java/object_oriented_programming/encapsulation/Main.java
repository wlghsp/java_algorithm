package complete_coding_interview_guide_in_java.object_oriented_programming.encapsulation;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.feed();
        cat.play();
        cat.feed();
        cat.sleep();

        System.out.println("Energy: " + cat.getEnergy());
        System.out.println("Mood: " + cat.getMood());
        System.out.println("Hungry: " + cat.getHungry());
    }
}