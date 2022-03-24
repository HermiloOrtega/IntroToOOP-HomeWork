package classes;

public class Contact {
    // fields
    String name;
    String phone;
    String email;

    // constructor
    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
