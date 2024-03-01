class NonStaticInitializers {
    int length  = 10;                   // (1)
    //double area = length * width;       // (2) Not OK. Illegal forward reference.
    double area = length * this.width;  // (3) OK, but width has default value 0.
    int width   = 10;                   // (4)

    int sqSide = height = 20;           // (5) OK. Legal forward reference.
    int height;                         // (6)

    public static void main(String[] args) {
        NonStaticInitializers nonStaticInitializers = new NonStaticInitializers();
        System.out.println(nonStaticInitializers.area);
    }
}