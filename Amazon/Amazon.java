package Amazon;

public class Amazon implements CloudHostingProvider,CloudStorageProvider,CDNProvider {

    @Override
    public void getCDNAddress(String cdnAddress) {
     System.out.println("Amazon: CDN address is - " + cdnAddress);
    }

    @Override
    public void storeFile(String name) {
        System.out.println("Amazon: File '" + name);
    }

    @Override
    public void getFile(String name) {
        System.out.println("Amazon: Retrieving file '" + name + "' from cloud storage...");
    }

    @Override
    public void createServer(String region) {
       System.out.println("Amazon: Server created in region - " + region);
    }

    @Override
    public void listServer(String region) {
       System.out.println("Listing Servers in Region: " + region );
    }
    
}
