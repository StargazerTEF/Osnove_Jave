package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {


      boolean y;
      y = triangle(3,4,5);

        System.out.println(y);
    }

    public static boolean triangle (int a, int b, int c) {

        if (a * a + b * b == c * c) {
            return true;
        } else {
                return false;
            }
        }
    }

