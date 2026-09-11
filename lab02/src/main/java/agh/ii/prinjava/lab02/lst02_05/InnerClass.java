class InnerClass {
    int x;
    String z;

    void m1IC() {
        System.out.println("InnerClass.m1IC...");

        OuterClass.this.x = 3;
        InnerClass.this.x = 1; // or just this.x = 1;

        y = 10; // y from the OuterClass, i.e. it corresponds to OuterClass.this.y = 10;
        x = 1; // x from the InnerClass, i.e. it corresponds to this.x = 1; or InnerClass.this.x = 1;

        z = "abc"; // or his.z = "abc"; or InnerClass.this.z = "abc";
        OuterClass.this.z = 4;
    }
}
