package intefaces.tests;

interface IJogger {
    default boolean justDoIt(String msg) { return false; }  // (1)
    static  boolean justDoIt(int i)      {
        System.out.println("IJogger.justDoIt(int)");
        return true; }   // (2)
}

class Athlete implements IJogger {
    public boolean justDoIt(String msg)  {
        System.out.println("Athlete.justDoIt(String)");
        return true; }   // (3)
    public boolean justDoIt(int i)       {
        System.out.println("Athlete.justDoIt(int)");
        return false; }  // (4)
}

public class RaceA {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        IJogger jogger = athlete;
        System.out.println(jogger.justDoIt("Run"));             // (5)
        System.out.println("|" + athlete.justDoIt(10));       // (6)
        System.out.println(IJogger.justDoIt(1));
    }
}