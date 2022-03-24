package classes;

public class Client {
    public static void main(String[] args) {
        Contact lucas = new Contact("Lucas", "778-318-3796");
        Contact tomona = new Contact("Tomona", "778-123-4382", "tomona.sako@gmail.com");

        ContactsManager phoneBook = new ContactsManager();
        phoneBook.addContact(lucas);
        phoneBook.addContact(tomona);

        phoneBook.printAllContacts();

        phoneBook.searchContact("Martin");
        phoneBook.searchContact("Lucas");
    }
}
