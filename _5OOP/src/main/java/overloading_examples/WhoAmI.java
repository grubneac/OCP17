package overloading_examples;

class Light1 { /* ... */ }
class LightBulb extends Light1 { /* ... */ }
class SpotLightBulb extends LightBulb { /* ... */ }
class TubeLight1 extends Light1 { /* ... */ }
class NeonLight extends TubeLight1 { /* ... */ }

public class WhoAmI {
    public static void main(String[] args) {
        boolean result1, result2, result3, result4;
        Light1 light1 = new LightBulb();                    // (1)
        //  String str = (String) light1;                  // (2) Compile-time error!
        //  result1 = light1 instanceof String;            // (3) Compile-time error!

        System.out.println(light1 instanceof TubeLight1);             // (4) false: peer class.
        //  TubeLight1 tubeLight1 = (TubeLight1) light1;     // (5) ClassCastException!

        System.out.println(light1 instanceof SpotLightBulb);         // (6) false: superclass.
        //  SpotLightBulb spotRef = (SpotLightBulb) light1;// (7) ClassCastException!

        light1 = new NeonLight();                          // (8)
        if (light1 instanceof TubeLight1) {                 // (9) true.
            TubeLight1 tubeLight2 = (TubeLight1) light1;       // (10) OK.
            // Can now use tubeLight2 to access an object of the class NeonLight,
            // but only those members that the object inherits or overrides
            // from the superclass TubeLight1.
        }

        SpotLightBulb light2 = new SpotLightBulb();        // (11)
        System.out.println(light2 instanceof Light1);                 // (12) true.
        Light1 light = (Light1) light2;                      // (13) OK. Redundant cast.
    }
}