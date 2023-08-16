package v16_08_2023;

public class Vezbanje4_slack {
    public static void main(String[] args) {

        String fileName = "profile image.log";
        int resolutionLength = 1920, resolutionHeight = 1080;
        double sizeKb = resolutionLength * resolutionHeight/1024;
        int a = (int) sizeKb;
        double sizeMb = sizeKb/1024;

        System.out.println("File: " + fileName);
        System.out.println("Resolution: " + resolutionLength + " * " + resolutionHeight);
        System.out.println("Size (Kb): " + a);
        System.out.println("Size (Mb): " + sizeMb);






    }
}
