package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto a = new Auto();

        a.fullName = "Milan Jovanovic";
        a.brand = "BMW";
        a.doors = 5;
        a.fuelUsage = 10;
        a.speed = 200;
        a.ageOfBuild = 2013;
        a.regMonth = 10;
        a.horsePower = 3000;
        a.maxSpeed = 240;
        a.regId = 12312;
        a.airConditioning = true;


        a.printCarInfo();
       boolean x = a.speedLimit(120);
       double y = a.speedTicket(120);
       if (x) {
           System.out.println("Opa, kazna! Moras da platis " + y + "rsd.");
       } else {
           System.out.println("Dobar si, ne divljas!");
       }

       boolean z = a.isOldtimer();
       if (z) {
           System.out.println("Automobil je oldtimer.");
       } else {
           System.out.println("Automobil nije oldtimer.");
       }

       double q = a.regPrice(a.horsePower);
       boolean w = a.isRegExpired(11);
       if (w) {
           System.out.println("Istekla vam je registracija! Morate da platite " + q + "rsd.");
       } else {
           System.out.println("Jos uvek vam je registrovan auto.");
       }

        double gasUse = a.gasUsage(true);
        System.out.println(gasUse + "l");

        a.speedometer();

        }
    }

