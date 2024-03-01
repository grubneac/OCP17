package org.example.questions;
import java.util.*;
import java.util.function.*;
class Album {
    private static List<Album> albums = new ArrayList<>();
    private String title;
    private Album(String title) { this.title = title; }
    public String toString() { return title; }
    public static void addAlbum(String title) {
        albums.add(new Album(title));
    }
    public static void sortAlbums(Comparator<Album> c) {
        albums.sort(c);
    }
    public static void processAlbums(Consumer<Album> c) {
        albums.forEach(c);
    }
}
public class Test14RQ11 {
    public static void main(String[] args) {
        Album.addAlbum("New Songs");
        Album.addAlbum("More Songs");
        Album.addAlbum("Greatest Hits");
        Album.addAlbum("Old Songs");
        Album.sortAlbums((a1, a2) -> a1.toString().length() - a2.toString().length());
        Album.processAlbums(a -> {
            System.out.print(a.toString() + " ");
        });
    }
}

/*
* What is the result?
Select the one correct answer.
a.New Songs Old Songs More Songs Greatest Hits
b.New Songs More Songs Greatest Hits Old Songs
c.Greatest Hits More Songs Old Songs New Songs
d.Old Songs Greatest Hits More Songs New Songs
e.The program will throw an exception at runtime.
f. The program will fail to compile.
* */