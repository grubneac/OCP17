package questions;

import java.io.*;
public class Album implements Serializable {
    private static int numberOfTracks = 5;

    private String title;
    private transient int currentTrack;

    public Album(String title, int currentTrack) {
        this.title = title;
        this.currentTrack = currentTrack;
    }

    public void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        currentTrack = 3;
    }

    @Override
    public String toString() {
        return title+" "+numberOfTracks +" "+currentTrack;
    }
}