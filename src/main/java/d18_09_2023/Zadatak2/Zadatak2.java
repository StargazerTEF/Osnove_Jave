package d18_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

// U glavnom programu kreirati objekte i testirati sve funkionalnosti

        EmailValidator email = new EmailValidator();
        email.setEmail("milan.jov@gmail.co");

        PasswordValidator password = new PasswordValidator();
        password.setPassword("botcamp");

        PhoneValidator phone = new PhoneValidator();
        phone.setPhoneNumber("5a5 555 55");

        ValidationResult result = new ValidationResult();

        ValidationResult emailValidation = email.validationResult();
        ValidationResult passwordValidation = password.validationResult();
        ValidationResult phoneValidation = phone.validationResult();
        System.out.println("Email validacija: ");
        emailValidation.print();
        System.out.println();
        System.out.println("Pasword validacija: ");
        passwordValidation.print();
        System.out.println();
        System.out.println("Phone validacija: ");
        phoneValidation.print();

    }
}
