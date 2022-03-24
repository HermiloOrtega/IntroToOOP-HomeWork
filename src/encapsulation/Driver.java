package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("Talking to Strangers", "Malcolm Gladwell");

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.isBorrowed());

        // setting book1 borrowed field (instance var)
        book1.setBorrowed(true);
        System.out.println(book1.isBorrowed());

        Person mei = new Person("poke123");
        Person jiro = new Person("poke123");

        System.out.println(mei.isSamePerson(jiro));
    }
}
