import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== FOR LOOP =====
        System.out.println("FOR LOOP");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // ===== WHILE LOOP =====
        System.out.println("WHILE LOOP");
        int i = 1;
        System.out.println("Numbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        // ===== DO-WHILE LOOP =====
        System.out.println("DO-WHILE LOOP");
        int j = 1;
        System.out.println("Numbers from 1 to " + n + ":");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= n);

        System.out.println("\n");

        // ===== FOR-EACH LOOP =====
        System.out.println("FOR-EACH LOOP");
        System.out.print("Enter number of subjects: ");
        int size = sc.nextInt();

        int[] marks = new int[size];

        System.out.println("Enter marks:");
        for (int k = 0; k < size; k++) {
            marks[k] = sc.nextInt();
        }

        System.out.println("Marks entered:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        sc.close();
    }
}
