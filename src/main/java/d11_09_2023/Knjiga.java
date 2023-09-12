package d11_09_2023;

public class Knjiga {

    private int isbn;
    String title;
    private int yearPublished;
    private Autor autor;

    public Knjiga () {

    }
    public Knjiga (int isbn, String title, int yearPublished) {
        this.isbn = isbn;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public void printKnjigaInfo () {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Delo: " + this.title + " - " + this.yearPublished);
        if (this.autor != null) {
            System.out.print("autor: ");
            this.autor.printAutorInfo();
        }
    }

    public int getIsbn () {
        return this.isbn;
    }
    public void setIsbn (int isbn) {
        this.isbn = isbn;
    }
    public String getTitle () {
        return this.title;
    }
    public void setTitle (String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Autor getAutor () {
        return this.autor;
    }
    public void setAutor (Autor autor) {
        this.autor = autor;
    }

}
