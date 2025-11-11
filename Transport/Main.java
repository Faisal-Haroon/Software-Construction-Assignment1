package Transport;


public class Main {
    public static void main(String[] args) {

        // Human driver with electric engine
        Driver humanDriver = new Human();
        Transport electricTransport = new Transport("electric", humanDriver);
        electricTransport.deliver(" Gilgit Baltistan ");

        System.out.println("----------------------");

        // Robot driver with combustion engine
        Driver robotDriver = new Robot();
        Transport combustionTransport = new Transport("combustion", robotDriver);
        combustionTransport.deliver(" Karachi ");
    }
}

