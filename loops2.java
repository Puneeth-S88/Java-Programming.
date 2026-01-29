import java.util.Scanner;

public class loops2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- FOR LOOP ----------
        System.out.println("FOR LOOP (1 to n)");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // ---------- WHILE LOOP ----------
        System.out.println("\nWHILE LOOP (countdown)");
        int w = n;

        while (w > 0) {
            System.out.println(w);
            w--;
        }

        // ---------- DO-WHILE LOOP ----------
        System.out.println("\nDO-WHILE LOOP (runs at least once)");
        int d = 1;

        do {
            System.out.println("Hello Java");
            d++;
        } while (d <= 1);

        // ---------- FOR-EACH LOOP ----------
        System.out.println("\nFOR-EACH LOOP (array elements)");
        int[] arr = {10, 20, 30, 40, 50};

        for (int num : arr) {
            System.out.println(num);
        }

        // ---------- NESTED LOOP ----------
        System.out.println("\nNESTED LOOP (pattern)");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ---------- BREAK ----------
        System.out.println("\nBREAK example");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break;
            System.out.println(i);
        }

        // ---------- CONTINUE ----------
        System.out.println("\nCONTINUE example");
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }

        sc.close();
    }
}
