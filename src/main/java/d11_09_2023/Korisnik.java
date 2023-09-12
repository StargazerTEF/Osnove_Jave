package d11_09_2023;

public class Korisnik {

    private String firstName;
    private String lastName;

    public Korisnik () {

    }
    public Korisnik (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void print () {
        System.out.println(this.firstName + " " + this.lastName);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
