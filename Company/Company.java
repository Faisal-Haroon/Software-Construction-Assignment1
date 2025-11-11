package Company;

public abstract class Company {
    
    public abstract Emplyoee createEmployee();

    
    public void createSoftware() {
        Emplyoee emplyoee = createEmployee();
        System.out.println("Company is creating software with its employees...");
        emplyoee.doWork();
    }
}
