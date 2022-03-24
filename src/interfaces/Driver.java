package interfaces;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car(100, "Mercedes Benz");
        House h1 = new House(15);
        Caravan cr1 = new Caravan(2, 0);

        Movable[] movables = {c1, cr1};
        for (Movable m : movables) {
            // polymorphism
            m.move(10);
        }
        // compile-time vs run-time
        // down-casting
        Caravan castedCr = ((Caravan) movables[1]);
        castedCr.canFit(5);

        // Note:
        // down-casting to a 'wrong' type
        // 'ClassCastException' - runtime error (crash!)
    }
}
