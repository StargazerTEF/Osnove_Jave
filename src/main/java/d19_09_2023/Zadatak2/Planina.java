package d19_09_2023.Zadatak2;

public class Planina {
//Kreirati klasu Planina koja od privatnih atributa ima:
//ime planine
//naziv države u kojoj se nalazi
//visinu planine.
//a od javnih metoda:
//default-ni konstruktor i konstuktor koji postavlja sve parametre
//gettere i settere za sve atribute

    private String name;
    private String country;
    private double height;

    public Planina() {
    }

    public Planina(String name, String country, double height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
