import java.util.Scanner;
public class avg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum is:"+sum);
        double avg=(double)sum/num;
        System.out.println("The average is:"+avg);
    }
}