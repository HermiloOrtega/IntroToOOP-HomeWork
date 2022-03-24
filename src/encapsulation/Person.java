package encapsulation;

import java.util.UUID;

public class Person {
    private String username;
    private String sin;

    public Person(String username){
        this.username = username;
        this.sin = generateSin();
    }

    private String generateSin() {
        return "!!" + username.charAt(0)
                + "%%" + username.substring(1, username.length() - 1)
                + "&&" + username.charAt(username.length() - 1);
    }

    public String getUsername() {
        return username;
    }

    public boolean isSamePerson(Person other) {
        return this.sin.equals(other.sin);
    }
}
