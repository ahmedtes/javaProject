import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeShop {
    private String name;
    private MenuItem[] menu;
    private ArrayList<String> orders;
    double total = 0.0;
    ArrayList<String> ordersCopy;
    public CoffeeShop(String name, MenuItem[] menu) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<String>();
        this.ordersCopy=new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public String addOrder(String itemName) {
       for (int i=0;i<menu.length;i++) {
            if (item.getItem().equalsIgnoreCase(itemName)) {
                orders.add(menu[i].getItem());
                return "Added " + itemName + " to the order!";
            }
        }
        return "This item is currently unavailable!";
    }

    public String fulfillOrder() {
        if (!orders.isEmpty()) {
            String item = orders.remove(0);
            ordersCopy.add(item);
            for (int i=0;i<menu.length;i++) {
                if (menu[i].getItem().equalsIgnoreCase(menu[i])) {
                    return "The " + menu[i] + " is ready!";
                }
            }
        }
        return "ALL orders have been fulfilled!";
    }

    public String[] listOrders() {
        String[] ordersArray = new String[ordersCopy.size()];
        ordersArray = ordersCopy.toArray(ordersArray);
        return ordersArray;
    }

    public double dueAmount() {
        for (int j=0;j<ordersCopy.length;j++) {
            for (int i=0;i<menu.length;i++) {
                if (menu[i].getItem().equalsIgnoreCase(ordersCopy[j])) {
                    total += menu[i].getPrice();
                    break;
                }
            }
        }
        return total;
    }

    public String cheapestItem() {
        MenuItem cheapest = menu[0];
        for (int i=0;i<menu.length;i++) {
            if (menu[i].getPrice() < cheapest.getPrice()) {
                cheapest = menu[i];
            }
        }
        return cheapest.getItem();
    }

    public String[] drinksOnly() {
        ArrayList<String> drinks = new ArrayList<String>();
        for (int i=0;i<menu.length;i++) {
            if (menu[i].getType().equalsIgnoreCase("drink")) {
                drinks.add(menu[i].getItem());
            }
        }
        String[] drinksArray = new String[drinks.size()];
        drinksArray = drinks.toArray(drinksArray);
        return drinksArray;
    }

    public String[] foodOnly() {
        ArrayList<String> food = new ArrayList<String>();
        for (int i=0;i<menu.length;i++) {
            if (menu[i].getType().equalsIgnoreCase("food")) {
                food.add(item.getItem());
            }
        }
        String[] foodArray = new String[food.size()];
        foodArray = food.toArray(foodArray);
        return foodArray;
    }
}
