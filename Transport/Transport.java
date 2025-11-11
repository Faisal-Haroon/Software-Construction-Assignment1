package Transport;

public class Transport {

    private Engine engine;
    private Driver driver;
    
    public Transport(String engineType, Driver driver){
        engine = setEngine(engineType);
        this.driver = driver;
    }


    public Engine setEngine(String engineType){
        if (engineType.equals("electric")){
            return new ElectricEngine();      
         }
         else if (engineType.equals("combustion")){
            return new CombustionEngine();
         }
         else {
            System.out.println("Invalid Input");
            return null;
         }
    }

    public void deliver(String destination){
        engine.move();
        driver.navigate();
        System.out.println("Delivery at "+ destination);
    }
}
