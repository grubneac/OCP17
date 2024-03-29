package records;

import java.time.Year;

public class DataUser {
    public static void main(String[] args) {
        // Some ready-made CDs:                                               (2)
        CD cd0 = new CD("Jaav",      "Java Jive",       8, Year.of(2017), CD.Genre.POP);
        CD cd1 = new CD("Jaav",      "Java Jam",        6, Year.of(2017), CD.Genre.JAZZ);
        CD cd2 = new CD("Funkies",   "Lambda Dancing", 10, Year.of(2018), CD.Genre.POP);
        CD cd3 = new CD("Genericos", "Keep on Erasing", 8, Year.of(2018), CD.Genre.JAZZ);
        CD cd4 = new CD("Genericos", "Hot Generics",   10, Year.of(2018), CD.Genre.JAZZ);

        // An array of CDs.
        CD[] cdArray = {cd0, cd1, cd2, cd3, cd4};

        System.out.println("     Artist    Title           No. Year Genre");
        for(int i = 0; i < cdArray.length; ++i) {
            CD cd = cdArray[i];
            String cdToString = String.format("%-10s%-16s%-4d%-5s%-5s",
                    cd.artist(), cd.title(), cd.noOfTracks(),                    // (3)
                    cd.year(), cd.genre());
            System.out.printf("cd%d: %s%n", i, cdToString);
        }

        System.out.println();
        System.out.println(cd0.toString());                                // (4)

        CD cdX = new CD("Jaav",      "Java Jive",       8, Year.of(2017), CD.Genre.POP);
        System.out.println("cd0.equals(cdX): " + cd0.equals(cdX));         // (5)

        CD[] cdArray1 = {CD.cd0, CD.cd2, CD.cd4, new CD()};                   // (12)
        for(int i = 0; i < cdArray1.length; ++i) {
            CD cd = cdArray1[i];
            if (cd.isOther()) {                                                // (13)
                System.out.println(cd);                               // (14)
            }
        }
        System.out.println("Title: " + cdArray1[1].title());                  // (15)
    }
}