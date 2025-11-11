package Company;
public class Main {
    public static void main(String[] args) {

        Company gameDev = new GameDevCompany();
        Company outsourcing = new OutsourcingCompany();

        System.out.println("--- GameDev Company ---");
        gameDev.createSoftware();

        System.out.println("\n--- Outsourcing Company ---");
        outsourcing.createSoftware();
    }
}