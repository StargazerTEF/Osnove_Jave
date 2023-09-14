package p14_09_2023;

public class Zadatak5 {
    public static void main(String[] args) {

        TestStep step1 = new TestStep("Open app", "", "", "Test failed");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "Test failed");
        TestStep step3 = new TestStep("Click on login link", "", "", "Test failed");
        TestStep step4 = new TestStep("Click on login link", "", "", "Test failed");
        TestStep step5 = new TestStep("Check if form is visible", "visible", "visible", "Test failed");
        TestStep step6 = new TestStep("Enter username", "", "", "Test failed");
        TestStep step7 = new TestStep("Enter password", "", "", "Test failed");
        TestStep step8 = new TestStep("Check if login button is visible", "visible", "invisible", "Test failed");
        TestStep step9 = new TestStep("Click on login button", "", "", "Test failed");
        TestStep step10 = new TestStep("User should be logged", "logged", "not logged", "Test failed");
        TestStep step11 = new TestStep("Page should be/home", "/login", "/home", "Test failed");

        TestCase case1 = new TestCase(182, "Validate Login Form");

        case1.addStep(step1);
        case1.addStep(step2);
        case1.addStep(step3);
        case1.addStep(step4);
        case1.addStep(step5);
        case1.addStep(step6);
        case1.addStep(step7);
        case1.addStep(step8);
        case1.addStep(step9);
        case1.addStep(step10);
        case1.addStep(step11);

        case1.print();

    }
}
