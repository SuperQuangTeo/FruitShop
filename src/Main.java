import java.util.ArrayList;
import itemsList.*;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Fruits> fr = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> or = new Hashtable<>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose the service that you want: ");
            System.out.println("1. Create Fruit");
            System.out.println("2. Update Fruit");
            System.out.println("3. View orders");
            System.out.println("4. Shopping (for buyer)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Manager.createFruit(fr);
                    break;
                
                case 2:
                    Manager.display(fr);
                    break;
            
                default:
                    break;
            }
        } while (choice < 5);
    }
}