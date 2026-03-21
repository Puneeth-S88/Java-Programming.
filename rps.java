import java.util.Scanner;
public class rps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //2
        // System.out.println("Rock=1,Paper=2,sccissor=3");
        System.out.println("Player 1:\n Enter your choice:");

        int num1=sc.nextInt();
        System.out.println("Player 2:\n Enter your choice:");
        int num2 = sc.nextInt();
        if(num1==1 && num2==3 || num1==3 && num2==2 || num1==2 && num2==1){
            System.out.println("Player 1 won");
        }else if(num1==num2){
                System.out.println("tie");
            }
        
        else{
            System.out.println("Player 2 won");
        }
       }
}
