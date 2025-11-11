package Amazon;

public interface CloudStorageProvider {

    public abstract void storeFile(String name);
    public abstract void getFile(String name);
}
