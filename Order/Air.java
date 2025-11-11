package Order;


public class Air implements Shipping{
        @Override
    public double getCost(Order order) {
        return order.getTotal() * 0.1; 
    }

    @Override
    public String getDate(Order order) {
        return "Delivery in 1-2 business days (Air)";
    }
}
