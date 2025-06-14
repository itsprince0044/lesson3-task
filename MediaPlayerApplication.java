package Abstractioin;

abstract class MediaPlayer{
    //Abstract methods
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}

class VideoPlayer extends MediaPlayer implements Playlist{
    //Methods

    @Override
    public void play() {
        System.out.println("Play a video in MP4.");
    }

    @Override
    public void pause() {
        System.out.println("Pause a video in MP4.");
    }

    @Override
    public void stop() {
        System.out.println("Stop a video in MP4.");
    }

    public void rewind(){
        System.out.println("You can rewind the MP4 video by 10 seconds to watch that scene again.");
    }
    public void fastForward(){
        System.out.println("Click the fast-forward button to skip ahead in the MP4 video.");
    }

    @Override
    public void addSong() {
        System.out.println("Video is added.");
    }

    @Override
    public void removeSong() {
        System.out.println("Video is removed.");
    }
}

interface Playlist{
    public void addSong();
    public void removeSong();
}

public class MediaPlayerApplication {
    public static void main(String[]args){
        VideoPlayer videoPlayer=new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.rewind();
        videoPlayer.fastForward();
        videoPlayer.addSong();
        videoPlayer.removeSong();
    }
}
