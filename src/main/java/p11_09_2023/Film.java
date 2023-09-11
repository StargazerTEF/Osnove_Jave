package p11_09_2023;

public class Film {

    private String name;
    private int year;
    private Reziser reziraoGa;

    public Film () {

    }
    public Film (String name, int year, Reziser reziraoGa) {
        this.name = name;
        this.year = year;
        this.reziraoGa = reziraoGa;
    }
    public void printFilmInfo () {
        System.out.println("Film " + this.name + " snimljen " + year + " god.");
        System.out.println("Rezirao ga: " + reziraoGa.getFullName() + " star " + reziraoGa.getYears());
    }

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getYear () {
        return this.year;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public Reziser getReziraoGa () {
        return this.getReziraoGa();
    }
    public void setReziraoGa (Reziser reziraoGa) {
        this.reziraoGa = reziraoGa;
    }
}
