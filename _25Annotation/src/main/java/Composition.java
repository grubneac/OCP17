@MusicMeta public class Composition {         // (1) On class
    @MusicMeta private String description;      // (2) On field
    @MusicMeta public void play() {             // (3) On method
//  @MusicMeta int volume;                    // (4) Compile-time error!
    }
}