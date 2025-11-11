package Order;

public class Ground implements Shipping{
     @Override
    public double getCost(Order order) {
        if (order.getTotal() > 100) {
            return 0; 
        }
        return 10.0; 
    }

    @Override
    public String getDate(Order order) {
        return "Delivery in 5-7 business days (Ground)";
    }
}

