


public class Main {
    public static void main(String[] args) {
        // Instanțierea unui obiect de tip Elefant prin interfața Animal
        Animal elephantAsAnimal = new Elefant("Dodon", 150);
        elephantAsAnimal.eat();
        elephantAsAnimal.sleep();
        elephantAsAnimal.sound();
        elephantAsAnimal.move();
        elephantAsAnimal.description();
        Animal.staticMethod();

        // Instanțierea unui obiect de tip Elefant prin clasa abstractă Erbivor
        Erbivor elephantAsErbivor = new Elefant("Bidon", 200);
        elephantAsErbivor.graze();
        elephantAsErbivor.commonTrait();
    }
}
