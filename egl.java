import java.util.*;
public class egl{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the num1:");
        float num1=sc.nextFloat();
        System.out.println("Enter the num2:");
        float num2=sc.nextFloat();
        if(num1==num2){
            System.out.println("Both are equal");
        }
            else if(num1>num2){
                System.out.println("num1 is greater");
            }
            else{
                System.out.println("num2 is greater");
            }
        }
    }

