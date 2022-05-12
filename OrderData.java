import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class OrderData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of orders - ");
        int noOfOrders = in.nextInt();
        ArrayList<Order> orders = new ArrayList<Order>(noOfOrders);
        for (int index = 0; index < noOfOrders; index++) {
            System.out.print("Enter number of items - ");
            int noOfItems = in.nextInt();
            // Consume new line
            in.nextLine();

            ArrayList<String> items = new ArrayList<String>(noOfItems);
            for (int j = 0; j < noOfItems; j++) {
                System.out.printf("%d : Enter item name ", j + 1);
                items.add(in.nextLine());
            }
            System.out.print("Do you want COD [Y/N] - ");
            String wantCod = in.nextLine();
            Boolean boolWantCod = false;
            if (wantCod.equals("Y")) {
                boolWantCod = true;
            } else if (wantCod.equals("N")) {
                boolWantCod = false;
            } else {
                throw new InputMismatchException("Only Y and N are accepted");
            }
            orders.add(new Order(items, boolWantCod));
        }
        for (Order _order : orders) {
            System.out.println(_order);
        }
        in.close();

    }
}

class Order {
    static int counter = 0;
    public int orderId;
    public ArrayList<String> items;
    public Boolean COD;

    Order(ArrayList<String> _items, Boolean _COD) {
        orderId = counter + 1;
        counter++;
        items = _items;
        COD = _COD;
    }

    public String toString() {
        String isCod = COD ? "Yes" : "No";
        String result = String.format(
                "Order id: %d\n" +
                        "Is COD: %s\n",
                orderId, isCod);
        StringBuilder builder = new StringBuilder(result);
        for (String item : items) {
            builder.append(item + " ");
        }
        builder.append("\n");
        return builder.toString();
    }

}