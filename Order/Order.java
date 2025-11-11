package Order;

public class Order {
     private double total;
    private Shipping shipping;

    public Order(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        return shipping.getCost(this);
    }

    public String getShippingDate() {
        return shipping.getDate(this);
    }
}


