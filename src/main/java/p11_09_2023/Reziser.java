package p11_09_2023;

public class Reziser {
    private String fullName;
    private int years;

    public Reziser () {

    }
    public void printReziserInfo () {
        System.out.println("Reditelj " + this.fullName + " ima " + this.years + " godina.");
    }

    public String getFullName () {
        return this.fullName;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }
    public int getYears () {
        return this.years;
    }
    public void setYears (int years) {
        this.years = years;
    }
}
