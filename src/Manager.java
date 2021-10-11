import java.util.ArrayList;
import itemsList.*;
import java.util.Hashtable;
import java.util.Scanner;

public class Manager {
    

    public static void createFruit(ArrayList<Fruits> fr) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter Fruit ID: ");
            String fruitID = sc.nextLine().trim().toLowerCase();
            for (int i = 0; i < fr.size(); i++) {
                if (fr.get(i).getFruitID().equalsIgnoreCase(fruitID)) {
                    System.out.println("ID exist.");
                }
                return;
            }
            System.out.println("enter Fruit Name: ");
            String fruitName = sc.nextLine().trim().toLowerCase();
            System.out.println("enter price: ");
            int price = sc.nextInt();
            System.out.println("enter quantity: ");
            int quantity = sc.nextInt();
            System.out.println("enter origin: ");
            sc = new Scanner(System.in);
            String origin = sc.nextLine();
            fr.add(new Fruits(fruitID, fruitName, price, quantity, origin));
            System.out.println("Do you wanna continue create a new fruit? Yes(Y/y)||No(N/n)");
            String yn = sc.nextLine().trim();
            if (yn.equalsIgnoreCase("y")) {
                createFruit(fr);
            }
            if (yn.equalsIgnoreCase("n")) {
                return;
            }
        }    
        
    }


    public static void display(ArrayList<Fruits> fr) {
        System.out.printf("%15s%15s%15s%15s%15s\n", "ID", "Name", "Price", "quantity", "origin");
        for (Fruits fruits : fr) {
            System.out.printf("%15s%15s%15d%15d%15s", fruits.getFruitID(),fruits.getFruitName(),fruits.getPrice(),fruits.getQuantity(),fruits.getOrigin());
        }
    }

}