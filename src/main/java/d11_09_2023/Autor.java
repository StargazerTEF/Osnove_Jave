package d11_09_2023;

public class Autor {

    private String firstName;
    private String lastName;

    public Autor () {

    }
    public Autor (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
   }
   public void printAutorInfo () {
       System.out.println(this.firstName + " " + this.lastName);
    }

    public String getFirstName () {
        return this.firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public String getLastName () {
        return this.lastName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

}
