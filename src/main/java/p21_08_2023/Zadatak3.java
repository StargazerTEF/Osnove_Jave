package p21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        String spoj = "...";

        for (int i = 1; i <= 10; i++) {
            if (i % 2 !=0) {
                spoj = i + spoj;
            } else {
                spoj = spoj + i;
            }
        }
        System.out.println(spoj);
    }
}
