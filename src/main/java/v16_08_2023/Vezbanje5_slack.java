package v16_08_2023;

public class Vezbanje5_slack {
    public static void main(String[] args) {

        String fileName = "profile-image.png";
        String resizedName = "resized-profile-image.png";
        double resolutionLength = 1920, resolutionHeight = 1080;
        double scaleFactor = 1.3;
        double originalSize = resolutionLength * resolutionHeight / (1024 * 1024);

        double resizedLength = resolutionLength * scaleFactor;
        double resizedHeight = resolutionHeight * scaleFactor;

        double resizedResolution = resizedLength * resizedHeight;

        double resizedFileSize = resizedResolution / (1024 * 1024);

        System.out.println("Original image: " + fileName + " Size: " + originalSize + "Mb");
        System.out.println("Scale: " + scaleFactor);
        System.out.println("Resized image: " + resizedName + " Size: " + resizedFileSize + "Mb");
        System.out.println("|Click here to Download image|");



    }
}
