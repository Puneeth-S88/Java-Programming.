import java.util.Scanner;

public class even1{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enetr the number:");
        int num=Sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("Not even");
        }
    }
}