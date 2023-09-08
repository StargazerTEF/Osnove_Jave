package p08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        SlackMessage2 a = new SlackMessage2();

        a.fullName = "Maja Majic";
        a.message = "Hello";
        a.dateTime = "07-09-2023 20:30";

        a.printUserInfo();

        a.textUpdate("Caos!", "08-09-2023 21:45");
        a.printUserInfo();
    }
}
