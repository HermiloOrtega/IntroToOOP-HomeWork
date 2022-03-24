package classes;

// Driver == Client == Main
// - where you have the main method to run your java program!
public class Driver {
    public static void main(String[] args) {
        Pokemon pika = new Pokemon("Pikachu", "Electric", 100, 70);
//        pika.name = "Pikachu";
//        pika.type = "Electric";
//        pika.healthPoint = 100;
//        pika.attackPoint = 70;

        Pokemon charizard = new Pokemon("Charizard", "Fire/Fly", 120, 70);
//        charizard.name = "Charizard";
//        charizard.type = "Fire/Fly";
//        charizard.healthPoint = 120;
//        charizard.attackPoint = 70;

        // accessing fields
        System.out.println(pika.name);
        System.out.println(charizard.type);

        // call methods on an instance(object)
        pika.attack(charizard);
        System.out.println("Charizard (HP): " + charizard.healthPoint);
        pika.evolve();
        pika.attack(charizard);
        System.out.println("Charizard (HP): " + charizard.healthPoint);
    }
}
