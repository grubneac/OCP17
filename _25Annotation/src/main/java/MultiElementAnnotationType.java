public @interface MultiElementAnnotationType {

    public enum Priority { LOW, NORMAL, HIGH };

    public int certificationLevel()     default 1;                        // int
    String date()                       default "2021-01-11";   // String
    Class<? extends PrettyPrinter> pp()
            default AdvancedPrettyPrinter.class;          // type Class
    Priority priorityLevel()               default Priority.NORMAL;       // enum Priority
    Tag annotate()                         default @Tag;                  // Annotation type
    int[] value()                          default {10, 20, 30};          // Array, int[]
}
// Auxiliary classes:
class PrettyPrinter {}
class AdvancedPrettyPrinter extends PrettyPrinter {}