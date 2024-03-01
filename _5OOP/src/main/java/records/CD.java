package records;
import java.time.Year;

/** A record class that represents a CD. */
public record CD(String artist, String title, int noOfTracks,          // (1)
                 Year year, Genre genre) {
    // Normal canonical record constructor                              // (2)
//    public CD(String artist, String title, int noOfTracks, Year year, Genre genre) {
//        // Sanitize the parameter values:                                    (3)
//        artist = artist.strip();
//        title = title.strip();
//        noOfTracks = noOfTracks < 0 ? 0 : noOfTracks;
//        year =  year.compareTo(Year.of(2022)) > 0? Year.of(2022) : year;
//        genre = genre == null ? Genre.OTHER : genre;
//        // Initialize all component fields:                                   (4)
//        this.artist     = artist;
//        this.title      = title;
//        this.noOfTracks = noOfTracks;
//        this.year       = year;
//        this.genre      = genre;
//    }

    // Compact canonical record constructor                                    (2)
    public CD {
        // Sanitize the values passed to the constructor:                        (3)
        artist = artist.strip();
        title = title.strip();
        noOfTracks = noOfTracks < 0 ? 0 : noOfTracks;
        year =  year.compareTo(Year.of(2022)) > 0? Year.of(2022) : year;
        genre = genre == null ? Genre.OTHER : genre;

        // Cannot explicitly assign to component fields:                         (4)
        // this.artist = artist;                    // Compile-time error!
    }

    // A non-canonical record constructor                                      (5)
    public CD() {
        this(" Anonymous  ", "  No title  ", 0, Year.of(2022), Genre.OTHER);  // (6)
    }

    //  New instance methods:                                                  (8)
    public boolean isPop()   { return this.genre == Genre.POP; }
    public boolean isJazz()  { return this.genre == Genre.JAZZ; }
    public boolean isOther() { return this.genre == Genre.OTHER; }

    // Customize a get method:                                                 (9)
    @Override public String title() {
        return this.title.toUpperCase();
    }

    // Static fields with some ready-made CDs:                                 (10)
    public final static CD cd0
            = new CD("   Jaav",      "Java Jive",       8, Year.of(2017), Genre.POP);
    public final static CD cd2
            = new CD("Funkies ",   " Lambda Dancing  ", 10, Year.of(2024), null);
    public final static CD cd4
            = new CD("Genericos", "Hot Generics",   -5, Year.of(2018), Genre.JAZZ);

    // Declare a nested type:
    public enum Genre {POP, JAZZ, OTHER}                                   //  (11)

}
