import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the num1:");
        float num1 = Sc.nextFloat();

        System.out.println("Enter the num2:");
        float num2 = Sc.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum = " + sum);

        float diff =num1-num2;
        System.out.println("Diff is:"+diff);

        float mul=num1*num2;
        System.out.println("Mul is:"+mul);
        float div=num1/num2;
        if(num2==0){
            System.out.println("div by 0 is not possible");
        } else {
            System.out.println("Div is:"+div);
        

    }
    }
}