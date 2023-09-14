package p14_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Reakcija reakcija1 = new Reakcija("like", "Aki Akic");
        Reakcija reakcija2 = new Reakcija("srce", "Maja Majic");
        Reakcija reakcija3 = new Reakcija("cry", "Jova Jovic");

        FacebookPost post1 = new FacebookPost("Rade Radic", "Sta ima?");
        FacebookPost post2 = new FacebookPost("Mika Mikic", "Kako si?");
        FacebookPost post3 = new FacebookPost("Zika Zikic", "Ej");

        post1.reaguj(reakcija1);
        post2.reaguj(reakcija2);
        post3.reaguj(reakcija3);

        post1.print();
        post2.print();
        post3.print();
    }
}
