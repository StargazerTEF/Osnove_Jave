package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        operacije(x, y);
        operacije(10, 6);
        operacije(989, 33);

    }
    public static void operacije (int firstNum, int secNum) {

        int zbir = firstNum + secNum;
        int razlika = firstNum - secNum;
        int proizvod = firstNum * secNum;
        int kolicnik = firstNum / secNum;

        System.out.println(zbir + " | " + razlika + " | " + proizvod + " | " + kolicnik);
    }
}
