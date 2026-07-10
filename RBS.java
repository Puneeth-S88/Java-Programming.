import java.util.Scanner;

public class RBS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;

        int totalBill = 0;

        while (true) {

            System.out.println("\n========== WELCOME TO MY RESTAURANT ==========");
            System.out.println("1. Pizza      - ₹200");
            System.out.println("2. Burger     - ₹120");
            System.out.println("3. Sandwich   - ₹80");
            System.out.println("4. Coffee     - ₹50");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Pizza Quantity: ");
                    quantity = sc.nextInt();

                    totalBill = totalBill + (200 * quantity);

                    System.out.println(quantity + " Pizza(s) Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Burger Quantity: ");
                    quantity = sc.nextInt();

                    totalBill = totalBill + (120 * quantity);

                    System.out.println(quantity + " Burger(s) Added Successfully!");
                    break;

                case 3:
                    System.out.print("Enter Sandwich Quantity: ");
                    quantity = sc.nextInt();

                    totalBill = totalBill + (80 * quantity);

                    System.out.println(quantity + " Sandwich(es) Added Successfully!");
                    break;

                case 4:
                    System.out.print("Enter Coffee Quantity: ");
                    quantity = sc.nextInt();

                    totalBill = totalBill + (50 * quantity);

                    System.out.println(quantity + " Coffee(s) Added Successfully!");
                    break;

                case 5:
                    System.out.println("\n========== BILL ==========");
                    System.out.println("Total Amount = ₹" + totalBill);
                    System.out.println("==========================");
                    break;

                case 6:
                    System.out.println("\nThank You!");
                    System.out.println("Visit Again!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }
}