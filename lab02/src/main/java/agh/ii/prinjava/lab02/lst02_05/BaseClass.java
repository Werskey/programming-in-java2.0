class BaseClass {
    void m1() {
        System.out.println("BaseClass.m1()");
    }
}

public class Main {

    /**
     * Working with static member classes
     */
    private static void demo1() {
        System.out.println("demo1...");
        OuterClass.StaticNestedClass snc1 = new OuterClass.StaticNestedClass();
        snc1.m1SNC();
    }
