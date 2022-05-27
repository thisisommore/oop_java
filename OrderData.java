import java.util.ArrayList;
import java.util.List;

class OrderData {

    public static List<String> getNames(List<Order> orders) {
        List<String> itemNames = new ArrayList<String>();
        for (Order order : orders) {
            itemNames.addAll(order.itemNames);
        }
        return itemNames;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>();
        List<String> items1 = new ArrayList<String>();
        items1.add("TShirt");
        items1.add("Jeans");
        items1.add("Shirt");
        List<String> items2 = new ArrayList<String>();
        items2.add("Pant");
        items2.add("Socks");
        items2.add("Tie");
        orders.add(new Order(101, items1, true));
        orders.add(new Order(102, items2, true));

        System.out.println(getNames(orders));
    }
}

class Order {
    public int orderId;
    public List<String> itemNames;
    public Boolean COD;

    Order(int orderId, List<String> itemNames, Boolean COD) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.COD = COD;
    }

}