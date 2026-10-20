import java.util.Scanner;

class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = in.nextDouble();
        double shipping;
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.02;
        }


        double total = price + shipping;


        System.out.println("Shipping cost: $" + shipping);
        System.out.println("Total price: $" + total);
    }
}