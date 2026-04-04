import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.println("Enter a number:");
            i = sc.nextInt();   // taking input
        } while (i != 0);       // loop runs until user enters 0

        System.out.println("Loop ended");
    }
}