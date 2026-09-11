class OuterClass { // <- Top level class

    private int x; // this is private (!)
    private int y; // as above
    private int z; // as above

    private static int s; // private, static

/**
 * InnerClass (non-static member class) can be seen as a "member" of OuterClass,
 * hence it has access to the OuterClass private part
 */