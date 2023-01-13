package complete_coding_interview_guide_in_java.object_oriented_programming.jukebox.jukebox;

public class Song {
    private final String title;
    private final CD cd;

    // Song에 대한 더 자세한 내용
    public Song(String title, CD cd) {
        this.title = title;
        this.cd = cd;
    }   

    public CD getCd() {
        return cd;
    }

    public String getTitle() {
        return title;
    }
}