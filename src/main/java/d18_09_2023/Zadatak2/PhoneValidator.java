package d18_09_2023.Zadatak2;

public class PhoneValidator extends Validator {
//Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
//Atribut za broj telefona
//Geter i seter za broj telefona
//Broj telefona je validan ukoliko:
//Broj krece sa znakom +
//Ukoliko nema razmaka
//Sadrzi samo cifre
//Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
//	Metoda vraca rezultat sa greskama:
//Phone number must start with +
//Phone number cannot contain spaces
//Phone number can only contain numbers

    private String phoneNumber;

    public PhoneValidator() {
    }

    @Override
    public ValidationResult validationResult() {
        ValidationResult vr = new ValidationResult();
        if (!this.phoneNumber.startsWith("+")) {
            vr.addError("Phone number must start with +");
        }
        if (this.phoneNumber.contains(" ")) {
            vr.addError("Phone number cannot contain spaces");
        }
        int i = 0;
        boolean containsAtLeastOneNotNumber = false;
        while (!containsAtLeastOneNotNumber && i < this.phoneNumber.length()) {
            if (!Character.isDigit(this.phoneNumber.charAt(i))) {
                containsAtLeastOneNotNumber = true;
            }
            i++;
        }
        if (containsAtLeastOneNotNumber) {
            vr.addError("Phone number can only contain numbers");
        }
        return vr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
