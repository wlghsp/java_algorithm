package complete_coding_interview_guide_in_java.object_oriented_programming.jukebox.jukebox;

import java.util.List;

public class CD {
    private List<Song> songs;

    // CD에 대한 더 자세한 내용
    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}