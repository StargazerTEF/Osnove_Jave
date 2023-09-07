package p7_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage a = new SlackMessage();
        a.message = "Hello";
        a.fullName = "Ziggy Stardust";
        a.dateTime = "26-08-2021 18:55";

        SlackMessage b = new SlackMessage();
        b.message = "Caos";
        b.fullName = "Micko";
        b.dateTime = "26-08-2023 19:25";

        System.out.println(a.fullName + " - " + a.dateTime + "\n" + a.message);
        System.out.println(b.fullName + " - " + b.dateTime+ "\n" + b.message);
    }
}
