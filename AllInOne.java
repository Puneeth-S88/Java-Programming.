import java.util.Scanner;

public class AllInOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Print 1 to 10 (Stop at 6 - BREAK)");
            System.out.println("2. Print 1 to 10 (Skip multiples of 3 - CONTINUE)");
            System.out.println("3. Day of Week (SWITCH)");
            System.out.println("4. Calculator (SWITCH)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Using BREAK:");
                    for(int i = 1; i <= 10; i++) {
                        if(i == 6) {
                            break;
                        }
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Using CONTINUE:");
                    for(int i = 1; i <= 10; i++) {
                        if(i % 3 == 0) {
                            continue;
                        }
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();

                    switch(day) {
                        case 1: System.out.println("Monday"); break;
                        case 2: System.out.println("Tuesday"); break;
                        case 3: System.out.println("Wednesday"); break;
                        case 4: System.out.println("Thursday"); break;
                        case 5: System.out.println("Friday"); break;
                        case 6: System.out.println("Saturday"); break;
                        case 7: System.out.println("Sunday"); break;
                        default: System.out.println("Invalid day");
                    }
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    System.out.println("1:Add 2:Sub 3:Mul 4:Div");
                    int op = sc.nextInt();

                    switch(op) {
                        case 1: System.out.println("Sum = " + (a + b)); break;
                        case 2: System.out.println("Sub = " + (a - b)); break;
                        case 3: System.out.println("Mul = " + (a * b)); break;
                        case 4: System.out.println("Div = " + (a / b)); break;
                        default: System.out.println("Invalid operation");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);

        sc.close();
    }
}