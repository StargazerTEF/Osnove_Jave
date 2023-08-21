package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        int broj = 2;
        int stepen = 1;

        for (int i = 0; i < 7 ; i++) {
            stepen = stepen * broj;
        }
        System.out.println(broj + " na sedmi jednako je: " + stepen);
    }
}
