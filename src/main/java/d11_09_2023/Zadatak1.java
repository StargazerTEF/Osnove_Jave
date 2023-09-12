package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor autor1 = new Autor("Jova", "Zmaj");
        Autor autor2 = new Autor("Milos", "Crnjanski");

        Knjiga knjiga1 = new Knjiga(192, "Djulici", 1899);
        Knjiga knjiga2 = new Knjiga(112, "Uveoci", 1900);
        Knjiga knjiga3 = new Knjiga(201, "Roman o Londonu", 1961);
        Knjiga knjiga4 = new Knjiga(210, "Kod Hiperborejaca", 1966);

        knjiga1.setAutor(autor1);
        knjiga2.setAutor(autor1);
        knjiga3.setAutor(autor2);
        knjiga4.setAutor(autor2);

        knjiga1.printKnjigaInfo();
        knjiga2.printKnjigaInfo();
        knjiga3.printKnjigaInfo();
        knjiga4.printKnjigaInfo();
    }
}
