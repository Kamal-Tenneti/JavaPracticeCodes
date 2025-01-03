package Inheritence;

import java.util.Scanner;

class Order {
    // Data members
    private String NameCus;
    private float ordersNo;
    private int tableNo;

    // Scanner object
    private Scanner scanner = new Scanner(System.in);

    void acceptOrder() {
        System.out.print("Customer Name: ");
        NameCus = scanner.nextLine();
        System.out.print("No of Orders: ");
        ordersNo = scanner.nextFloat();
        System.out.print("Enter Student Table No: ");
        tableNo = scanner.nextInt();
    }

    void displayOrder() {
        System.out.println("Name: " + NameCus);
        System.out.println("Order No: " + ordersNo);
        System.out.println("Table No: " + tableNo);
    }

    // Getter methods for private members
    public String getNameCus() {
        return NameCus;
    }

    public float getOrdersNo() {
        return ordersNo;
    }

    public int getTableNo() {
        return tableNo;
    }
}

class Table extends Order {
    private float discount;

    @Override
    void displayOrder() {
        super.displayOrder(); // Displaying inherited properties

        // Using the scanner object inherited from Order class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Discount: ");
        discount = scanner.nextFloat();

        // Calculation based on inherited members
        discount = getTableNo() * getOrdersNo();

        System.out.println("Discount: " + discount);

        // Additional calculations, if needed
        float orderNo = getOrdersNo();
        orderNo = orderNo % 10;
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        // Create an instance of Table and call methods
        Table table = new Table();
        table.acceptOrder();
        table.displayOrder();
    }
}
