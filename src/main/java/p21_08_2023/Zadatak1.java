package p21_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Suma je: " + sum);
    }
}
