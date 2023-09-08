package p08_09_2023;

public class Auto {

    String fullName;

    String brand;

    int doors;

    double fuelUsage;

    double speed;

    int ageOfBuild;

    int regMonth;

    int horsePower;

    int regId;

    boolean airConditioning;

    double maxSpeed;


    public void printCarInfo() {

        System.out.println(this.fullName);
        System.out.println(this.brand + " - " + doors + "-ro vrata");
        System.out.println("Sa potrosnjom od " + fuelUsage + "l na 100km");
        System.out.println(speed + "km/h je trenutna brzina.");
    }

    public boolean speedLimit(int spLim) {

        if (this.speed > spLim) {
            return true;
        }
        return false;
    }

    public double speedTicket(int spLim) {
        double ticket = 0;
        ticket = (this.speed - spLim) * 1000;
        return ticket;
    }

    public boolean isOldtimer() {
        if (this.ageOfBuild < 1950) {
            return true;
        }
        return false;
    }

    public boolean isRegExpired(int currentMonth) {
        if (regMonth < currentMonth) {
            return true;
        }
        return false;
    }

    public double regPrice(int horsePower) {
        double price = 1;
        if (horsePower < 2000) {
            price = horsePower * 100;
        } else {
            price = horsePower * 100 + 0.3 * (horsePower * 100);
        }
        return price;
    }

    public void addThrottle() {
        speed += 10;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void lowThrottle() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
    }

    public double gasUsage(boolean airConditioning) {
        double gasUse = 1;
        if (airConditioning) {
            gasUse = (speed / 100 * fuelUsage) * 1.2;
        } else {
            gasUse = speed / 100 * fuelUsage;
        }
        return gasUse;
    }

    public void speedometer() {

        for (int i = 0; i < 100; i++) {
            if (i < speed * 100 / maxSpeed) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
    }
}
