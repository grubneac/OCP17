package q24.p1;

public class Util {
    public enum Format {
        JPEG { public String toString() {return "Jpeggy"; }},
        GIF  { public String toString() {return "Giffy"; }},
        TIFF { public String toString() {return "Tiffy"; }};
    }
    public static <T> void print(T t) {
        System.out.print("|" + t + "|");
    }
}
