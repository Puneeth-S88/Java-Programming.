import java.util.Scanner;
public class vote{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age:");
        float age=sc.nextFloat();
        if(age>=18){
            System.out.println("eligible to vote");
        }else if( age==18){
            System.out.println("Eligible to vote");

        }else{
            System.out.println("not eligible");
        }

    }
}