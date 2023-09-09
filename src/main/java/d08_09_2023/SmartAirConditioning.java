package d08_09_2023;

public class SmartAirConditioning {
    String brand;
    int coolingPower;
    int heatingPower;
    int temp;
    String mode;

    public void print () {
        System.out.println(this.brand + " - " + this.mode + " - " + this.temp);
    }
    public int powerUsage () {
        if (this.mode.equals("cooling")) {
            return 30 * 15 * this.coolingPower;
        } else if (this.mode.equals("heating")){
            return 30 * 15 * this.heatingPower;
        } else {
            return 0;
        }
    }

    public int expenditurePerMonth () {
        if (this.powerUsage() <= 350) {
            return this.powerUsage() * 6;
        } else {
            return this.powerUsage() * 9;
        }
    }
}
