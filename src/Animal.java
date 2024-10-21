
interface Animal {
    int AGE = 100;
    String NAME = "Unknown";

    void eat();
    void sleep();
    void sound();
    void move();

    default void description() {
        System.out.println("This is an animal.");
    }

    static void staticMethod() {
        System.out.println("static method in Animal interface.");
    }
}