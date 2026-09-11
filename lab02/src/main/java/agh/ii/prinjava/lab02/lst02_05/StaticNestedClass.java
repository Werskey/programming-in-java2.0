
/**
 * Static member class
 */
static class StaticNestedClass {
    /**
     * OuterClass.this is not accessible here!
     */
    void m1SNC() {
        System.out.println("StaticNestedClass.m1SNC...");
        // OuterClass.this.x = 1; // Error: OuterClass.this cannot be referenced from a static context
        OuterClass.s = 5; // OK, since "s" is static
    }
}