import java.util.Scanner;
public class btn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Button 1 pressed");
                break;
            case 2:
                System.out.println("Button 2 pressed");
                break;
            case 3:
                System.out.println("Button 3 pressed");
                break;
            default:
                System.out.println("Invalid button");
        }
        }
    }