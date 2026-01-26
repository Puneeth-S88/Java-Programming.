import java.util.Scanner;
public class sum{
    public static void main(String[]args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter 1st number:");
        float num1=sc.nextFloat();
        System.out.println("Enter 2nd number:");
        float num2=sc.nextFloat();
        float sum=num1+num2;
        float diff=num1-num2;
        System.out.println("Sum is" +sum);
        System.out.println("Difference is:" +diff);
          }
}
