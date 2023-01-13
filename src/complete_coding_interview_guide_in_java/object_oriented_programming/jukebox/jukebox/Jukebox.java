package complete_coding_interview_guide_in_java.object_oriented_programming.jukebox.jukebox;

public class Jukebox implements Selector {
    private final CDPlayer cdPlayer;

    public Jukebox(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;        
    }

    @Override
    public void nextSongBtn() {        
        System.out.println("Playing next song ...");             
    }

    @Override
    public void prevSongBtn() {
        System.out.println("Playing previous song ...");
    }

    @Override
    public void addSongToPlaylistBtn(Song song) { }

    @Override
    public void removeSongFromPlaylistBtn(Song song) { }

    @Override
    public void shuffleBtn() { }
}