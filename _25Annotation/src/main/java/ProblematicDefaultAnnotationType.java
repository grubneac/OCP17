public @interface ProblematicDefaultAnnotationType {
//    int id()          default (int) (Math.random() * 10);// Not a const expression.
//    String value()    default null;                      // Cannot be null.
//    String deadline() default new String("2021-01-11");  // Not a const expression.
//    String[] team()   default new String[] {"VJ", "PT"}; // Not a const expression.
}
