package v14_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("Pera", "Petar Petrovic", "pera@gmail.com");
        InstagramUser user2 = new InstagramUser("Mika", "Milos Kitic", "mika@gmail.com");

        InstagramTag tag1 = new InstagramTag(3, 7, user1);
        InstagramTag tag2 = new InstagramTag(2, 5, user2);

        InstagramImage image1 = new InstagramImage(640, 480, "instagram.com/korisnik-pera/profilna.jpg" );
        InstagramImage image2 = new InstagramImage(470, 325, "instagram.com/korisnik-mika/profilna.jpg" );

        InstagramPost post1 = new InstagramPost("Profilna slika");
        InstagramPost post2 = new InstagramPost("Naslovna strana");

        image1.addTag(tag1);
        image2.addTag(tag2);

        post1.addPic(image1);
        post2.addPic(image2);

        post1.print();
        post2.print();

    }
}
