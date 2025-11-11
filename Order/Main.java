package Order;

public class Main {
   
    public static void main(String[] args) {
        Order order1 = new Order(120);
        order1.setShipping(new Ground());

        System.out.println("--- Ground Shipping ---");
        System.out.println("Total: $" + order1.getTotal());
        System.out.println("Shipping Cost: $" + order1.getShippingCost());
        System.out.println(order1.getShippingDate());

        System.out.println();

        Order order2 = new Order(80);
        order2.setShipping(new Air());

        System.out.println("--- Air Shipping ---");
        System.out.println("Total: $" + order2.getTotal());
        System.out.println("Shipping Cost: $" + order2.getShippingCost());
        System.out.println(order2.getShippingDate());
    }
}

