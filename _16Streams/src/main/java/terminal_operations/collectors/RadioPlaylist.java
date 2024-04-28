package terminal_operations.collectors;

import util.CD;

import java.util.List;

// Radio station with a playlist.
public class RadioPlaylist {                                               // (1)
    private final String radioStationName;
    private final List<CD> Playlist;

    public RadioPlaylist(String radioStationName, List<CD> cdList) {
        this.radioStationName = radioStationName;
        this.Playlist = cdList;
    }

    public String getRadioStationName() { return this.radioStationName; }
    public List<CD> getPlaylist() { return this.Playlist; }
}