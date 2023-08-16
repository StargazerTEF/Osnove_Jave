package v16_08_2023;

public class Vezbanje6_slack {
    public static void main(String[] args) {

        String fileName = "Tea Tairovic - Bibi Habibi (Official Video | Album Balerina)";
        int videoLength = 149;
        int videoLengthMinutes = videoLength / 60;
        int videoLengthSeconds = videoLength - videoLengthMinutes * 60;
        int framesPerSecond = 20;
        int resolutionLength = 1920, resolutionHeight = 1080;

        double resolutionMb = resolutionLength * 1.0 * resolutionHeight / (1024 * 1024);

        double minimalNetworkSpeed = resolutionMb * framesPerSecond;

        int a = (int) minimalNetworkSpeed;

        System.out.println(fileName);
        System.out.println(videoLengthMinutes + ":" + videoLengthSeconds + " <|||||");
        System.out.println("Number of frames per second: " + framesPerSecond);
        System.out.println("Resolution: " + resolutionLength + "*" + resolutionHeight);
        System.out.println("Minimal network speed: " + a + "Mb/s");







    }
}
