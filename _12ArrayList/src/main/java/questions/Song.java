package questions;

public class Song {
    private String name;
    public Song(String name) {
        this.name = name;
    }
    public void update() {
        name = name.toUpperCase();
    }
    public String toString() {
        return name;
    }
}
