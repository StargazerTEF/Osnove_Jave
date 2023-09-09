package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//Kreirati klasu FacebookPost koja ima:
//Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1

        FacebookPost a = new FacebookPost();
        FacebookPost b = new FacebookPost();

        a.fullNameUser1 = "Milan Jovanovic";
        a.fullNameUser2 = "Vladimir Ilic";
        a.text = "Vlada car!";
        a.likes = 0;
        a.shares = 0;

        b.fullNameUser1 = "Mila Milic";
        b.fullNameUser2 = "Maja Majic";
        b.text = "Lepa ti je frizura.";
        b.likes = 0;
        b.shares = 0;

        a.likeCounter(true);
        a.likeCounter(true);
        a.likeCounter(true);
        a.likeCounter(true);
        a.dislikeCounter(true);
        a.shareCounter(true);

        a.print();

        b.likeCounter(true);
        b.likeCounter(true);
        b.likeCounter(true);
        b.dislikeCounter(true);
        b.dislikeCounter(true);
        b.dislikeCounter(true);
        b.dislikeCounter(true);
        b.shareCounter(true);
        b.shareCounter(true);

        b.print();

    }
}
