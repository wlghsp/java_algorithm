package complete_coding_interview_guide_in_java.object_oriented_programming.inheritance;

public class Main {

    public static void main(String[] args) {
        Programmer p = new Programmer("Joana Nimar", "Toronto");
        String name = p.getName();
        String team = p.getTeam();
        System.out.println(name + " is assigned to the " + team + " team");
    }
}