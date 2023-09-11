package p11_09_2023;

public class Student {

    private String ime;

    private String prezime;

    private int brInd;

    private boolean isOnBudget;

    public String getIme() {
        return ime;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public int getBrInd() {
        return brInd;
    }
    public void setBrInd (int brInd) {
        this.brInd = brInd;
    }

    public boolean getIsOnBudget() {
        return isOnBudget;
    }
    public void setIsOnBudget (boolean isOnBudget) {
        this.isOnBudget = isOnBudget;
    }

    public void printStudentInfo () {
        System.out.print(this.ime + " " + this.prezime + ", br indeksa: " + this.brInd + ". ");
        if (this.isOnBudget) {
            System.out.println("Student je na budzetu.");
        } else {
            System.out.println("Student je samofinansirajuci.");
        }
    }
}
