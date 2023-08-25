package p25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        int x = reversing(5);
        System.out.println(x);
    }
    public static int reversing(int number) {

        int negNum = number * - 1;
        return negNum;
    }
}
