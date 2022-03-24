package classes;

public class ContactsManager {
    // fields
    Contact[] friendsList;
    int friendsCount;

    // constructor
    ContactsManager() {
        friendsList = new Contact[500];
        friendsCount = 0;
    }

    // methods
    void addContact(Contact contact) {
        friendsList[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (friendsList[i].name.equals(searchName)) {
                System.out.println("Found the match!");
                System.out.println(friendsList[i].name);
                System.out.println(friendsList[i].phone);
                System.out.println(friendsList[i].email);
                return friendsList[i];
            }
        }
        System.out.println("No match!");
        return null;
    }

    void printAllContacts() {
        int i = 0;
        for (Contact contact : friendsList) {
            if (i == friendsCount) { break; }
            System.out.println("[" + i + "]: " + contact.name + " - "
                    + contact.phone + ", " + contact.email);
            i++;
        }
    }
}
