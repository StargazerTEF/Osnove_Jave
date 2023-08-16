package v16_08_2023;

public class Vezbanje2_slack {
    public static void main(String[] args) {

        String fileName = "profile-image.png";
        int fileSize = 7;
        double fileDownloadedSize = 2;

        double percentOfDownloadedFileSize = (fileDownloadedSize/fileSize) * 100;

        int d = (int) percentOfDownloadedFileSize;

        System.out.println(fileName + fileSize + "Mb/" + fileDownloadedSize + "Mb/");
        System.out.println("**************************");
        System.out.println("************* " + d + "%");
        System.out.println("**************************");



    }
}
