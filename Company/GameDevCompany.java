package Company;

class GameDevCompany extends Company {
    @Override
    public Emplyoee createEmployee() {
        return new Designer();  
        }
}
