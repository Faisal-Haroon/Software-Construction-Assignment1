package Amazon;

public class Main {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        DropBox dropbox = new DropBox();

        System.out.println("-----Amazon Services----- ");
        amazon.createServer("Asia-Pacific");
        amazon.getCDNAddress("cdn.amazon.com");
        amazon.storeFile("Monthly_report.pdf");
        amazon.getFile("Monthly_report.pdf");

        System.out.println("\n--- Dropbox Services ---");
        dropbox.storeFile("photo.jpg");
        dropbox.getFile("photo.jpg");
    }
}
