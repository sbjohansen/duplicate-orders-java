import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Objects;

class Order {
    int orderID;
    int orderClientID;
    LocalDate orderDate;
    String orderStatus;

    public Order(int orderID, int orderClientID, LocalDate orderDate, String orderStatus) {
        this.orderID = orderID;
        this.orderClientID = orderClientID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getOrderClientID() {
        return orderClientID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && orderClientID == order.orderClientID && Objects.equals(orderDate, order.orderDate) && Objects.equals(orderStatus, order.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, orderClientID, orderDate, orderStatus);
    }

    @Override
    public String toString() {
        return "ID:" + orderID +
                ", Client ID: " + orderClientID +
                ", Date: " + orderDate +
                ", Status: '" + orderStatus + '\'';
    }

}


public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1, 1, LocalDate.of(2021, 1, 1), "New");
        Order order2 = new Order(2, 2, LocalDate.of(2021, 1, 2), "Pending");
        Order order3 = new Order(3, 3, LocalDate.of(2021, 1, 3), "New");
        //duplicate order
        Order order4 = new Order(3, 3, LocalDate.of(2021, 1, 3), "New");

        HashSet<Order> orders = new HashSet<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        for(Order order : orders){
            System.out.println(order);
        }

    }

}
