import java.util.Scanner;

public class allpatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        while (true) {
            System.out.println("\n1.Solid Rectangle\n2.Hollow Rectangle\n3.Right Triangle\n4.Inverted Triangle\n5.Pyramid\n6.Inverted Pyramid\n7.Diamond\n8.Right Aligned Triangle\n9.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 5; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 6; j++) {
                            if (i == 1 || j == 1 || i == 5 || j == 6)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 4:
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 5:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 6:
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 7:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 8:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++)
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 9:
                    return;
            }
        }
    }
}