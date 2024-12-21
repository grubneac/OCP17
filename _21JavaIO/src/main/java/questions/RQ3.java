package questions;

import java.nio.file.FileSystem;
import java.nio.file.Path;

import static java.nio.file.FileSystems.getFileSystem;

public class RQ3 {
    public static void main(String[] args) {
        Path earth = Path.of("planets", "earth");
        System.out.println(earth);
        Path moonOrbit = earth.resolve(Path.of("moon", "orbit.param"));
        System.out.println(moonOrbit);
        Path mars = earth.resolveSibling("mars");
        System.out.println(mars);
        Path fromMarsToMoon = mars.relativize(moonOrbit);
        System.out.println(fromMarsToMoon);
    }
}
/*
* What is the result?
Select the one correct answer.

a. ../earth/moon/orbit.param
b. /planets/mars/../earth/moon/orbit.param
c. /planets/earth/moon/orbit.param
d. ./mars/../earth/moon/orbit.param
e. The program will throw an exception at runtime.
*
* */