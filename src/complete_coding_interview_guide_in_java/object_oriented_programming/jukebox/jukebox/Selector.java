package complete_coding_interview_guide_in_java.object_oriented_programming.jukebox.jukebox;

public interface Selector {
    public void nextSongBtn();
    public void prevSongBtn();
    public void addSongToPlaylistBtn(Song song);
    public void removeSongFromPlaylistBtn(Song song);
    public void shuffleBtn();
}