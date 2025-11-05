import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // TODO A1: Ask the user for item name, price, and quantity
        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // TODO B1: Calculate the total cost (price * quantity)
        double total = price * quantity;

        // TODO C1: Create a FileWriter for "receipt.txt"
        FileWriter writer = new FileWriter("receipt.txt");

        // TODO C2: Write all purchase details to the file
        writer.write("Item: " + item + "\n");
        writer.write("Price: $" + price + "\n");
        writer.write("Quantity: " + quantity + "\n");
        writer.write("Total: $" + total + "\n");

        // TODO C3: Close the FileWriter and print "Receipt saved!"
        writer.close();
        System.out.println("Receipt saved!");
    }
}
