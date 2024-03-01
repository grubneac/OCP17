import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        System.out.println("---------------------MERGE------------------------");
        Map<Integer, String> etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);
        System.out.println("BEFORE: " + etnMap);
        etnMap.merge(112, "Mordor", (oVal, value) -> null);      // (1) null, removed
        etnMap.merge(999, "Mordor", (oVal, value) -> "Uganda");  // (2) Uganda, updated
        etnMap.merge(190, "Mordor", (oVal, value) -> null);      // (3) Mordor, updated
        etnMap.merge(911, "Mordor", (oVal, value) -> "USA");     // (4) Mordor, updated
        etnMap.merge(100, "Mordor", (oVal, value) -> null);      // (5) Mordor, inserted
        etnMap.merge(110, "Mordor", (oVal, value) -> "China");   // (6) Mordor, inserted
// After: {100=Mordor, 999=Uganda, 110=Mordor, 190=Mordor, 911=Mordor}
        System.out.println("AFTER: " + etnMap);

        System.out.println("\n----------------------COMPUTE--------------------");
        etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);
        System.out.println("BEFORE: " + etnMap);
// Before: {112=Norway, 999=UK, 190=null, 911=null}
        etnMap.compute(112, (key, oVal) -> null);              // (7) null, removed
        etnMap.compute(999, (key, oVal) -> "Uganda");          // (8) Uganda, updated
        etnMap.compute(190, (key, oVal) -> null);              // (9) null, removed
        etnMap.compute(911, (key, oVal) -> "USA");             // (10) USA, updated
        etnMap.compute(100, (key, oVal) -> null);              // (11) null, no action
        etnMap.compute(110, (key, oVal) -> "China");           // (12) China, inserted
// After: {110=China, 999=Uganda, 911=USA}
        System.out.println("AFTER: " + etnMap);

        System.out.println("\n----------------------computeIfAbsent--------------------");
        etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);
        System.out.println("BEFORE: " + etnMap);
// Before: {112=Norway, 999=UK, 190=null, 911=null}
        etnMap.computeIfAbsent(112, key -> null);              // (13) Norway, no change
        etnMap.computeIfAbsent(999, key -> "Uganda");          // (14) UK, no change
        etnMap.computeIfAbsent(190, key -> null);              // (15) null, no change
        etnMap.computeIfAbsent(911, key -> "USA");             // (16) USA, updated
        etnMap.computeIfAbsent(100, key -> null);              // (17) null, no action
        etnMap.computeIfAbsent(110, key -> "China");           // (18) China, inserted
// After: {112=Norway, 110=China, 999=UK, 190=null, 911=USA}
        System.out.println("AFTER: " + etnMap);

        System.out.println("\n----------------------computeIfPresent--------------------");
        etnMap = new HashMap<>();
        etnMap.put(112, "Norway");
        etnMap.put(999, "UK");
        etnMap.put(190, null);
        etnMap.put(911, null);
        System.out.println("BEFORE: " + etnMap);
// Before: {112=Norway, 999=UK, 190=null, 911=null}
        etnMap.computeIfPresent(112, (key, oVal) -> null);      // (19) null, removed
        etnMap.computeIfPresent(999, (key, oVal) -> "Uganda");  // (20) Uganda, updated
        etnMap.computeIfPresent(190, (key, oVal) -> null);      // (21) null, no change
        etnMap.computeIfPresent(911, (key, oVal) -> "US.A");     // (22) null, no change
        etnMap.computeIfPresent(100, (key, oVal) -> null);      // (23) null, no action
        etnMap.computeIfPresent(110, (key, oVal) -> "China");   // (24) null, no action
// After: {999=Uganda, 190=null, 911=null}
        System.out.println("AFTER: " + etnMap);
    }
}
