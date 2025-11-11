package Amazon;

public interface CloudHostingProvider {

    public abstract void createServer(String region);
    public abstract void listServer(String region);
}

