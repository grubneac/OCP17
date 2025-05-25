package q47;

import java.time.Duration;
public record Song(String title, Duration duration) {
    // (1) INSERT CODE HERE

}

/*
* Which option can be inserted into the Song record declaration at (1),
* so that the program will print Song[title=IMAGINE, duration=PT1M46S]?
Select the one correct answer.

a.
public Song(int seconds) {
     this(this.title.toUpperCase(), Duration.ofSeconds(seconds));
   }
b.
public Song(int seconds) {
     this(title.toUpperCase(), Duration.ofSeconds(seconds));
   }
c.
public Song(String title, int seconds) {
     this(title.toUpperCase(), Duration.ofSeconds(seconds));
   }
d.
public Song(String title, int seconds) {
     this.title = title.toUpperCase();
     this.duration = Duration.ofSeconds(seconds);
   }
e.
public Song {
     this.title.toUpperCase();
     this.duration = Duration.ofSeconds(seconds));
   }
* */