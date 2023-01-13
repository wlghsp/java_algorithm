package complete_coding_interview_guide_in_java.object_oriented_programming.inheritance;

public class Programmer extends Employee {
    private String team;

    public Programmer(String name, String team) {
        super(name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
