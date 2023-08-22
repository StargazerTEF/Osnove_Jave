package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i = 0;
        String expectedResult = "";
        String actualResult = "";

        while (expectedResult.equals(actualResult) && i < 5) {
            System.out.print("Input expected result: ");
            expectedResult = s.next();
            System.out.print("Input actual result: ");
            actualResult = s.next();
            i++;

            if (!expectedResult.equals(actualResult)) {
                System.out.println("Test failed: Epected " + expectedResult + " but got " + actualResult + ".");
            }
        }
            System.out.println("Test passed!");
    }
}
