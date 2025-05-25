package q48;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        try {
            Path sun = Path.of("/q45");
            Files.walk(sun)
                    .map(p->p.getName(p.getNameCount()-1).toString())
                    .sorted()
                    .limit(3)
                    .forEach(p->System.out.println(p.substring(2)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
./Sun/1_Mercury
./Sun/2_Venus
./Sun/3_Earth
./Sun/3_Earth/1_Moon
./Sun/4_Mars
./Sun/4_Mars/1_Phobos
./Sun/4_Mars/2_Deimos
./Sun/5_Jupiter
./Sun/5_Jupiter/1_Io
./Sun/5_Jupiter/2_Europa
./Sun/5_Jupiter/3_Ganymede
./Sun/5_Jupiter/4_Calisto
./Sun/6_Saturn
./Sun/7_Uranus
./Sun/8_Neptune

What is the result?
Select the one correct answer.

a.
Io
Mercury

b.
Io
Mercury
Moon

c.
Io
Mercury
Moon
Phobos

d.
Earth
Ganymede

e.
Venus
Deimos Europa
* */