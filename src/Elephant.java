class Elefant extends Erbivor implements Animal {
    private String name;
    private int age;
    public Elefant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void sound() {
        System.out.println(name + " makes a trumpet sound.");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void graze() {
        System.out.println(name + " is grazing.");
    }
}