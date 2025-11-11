package Company;

class OutsourcingCompany extends Company {
    @Override
    public Emplyoee createEmployee() {
        return new Programmer();  
    }
}
