package Amazon;

public class DropBox implements CloudStorageProvider{

  @Override
    public void storeFile(String fileName) {
        System.out.println("Dropbox: File '" + fileName);
    }

    @Override
    public void getFile(String fileName) {
        System.out.println("Dropbox: Retrieving file '" + fileName + "' from Dropbox cloud...");
    }
    
}
