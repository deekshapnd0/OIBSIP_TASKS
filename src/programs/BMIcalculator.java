package programs;
import java.util.Scanner;
public class BMIcalculator {
    // program to calculate body mass index
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double BMI, height, weight;
        System.out.println("enter the weight in Kg");
        weight = sc.nextDouble();
        System.out.println("enter the height in meters");
        height = sc.nextDouble();
        // CALCULATING BMI
        BMI = weight/(height*height);
        System.out.println("Your body mass index is "+BMI);
        // conditions of BMI
        if (BMI<18.5){
            System.out.println("You are UNDERWEIGHT");
        }
        else if(BMI>18.5 && BMI<24.9){
            System.out.println("You are NORMAL");
        }
        else if (BMI>25 && BMI<29.9){
            System.out.println("You are OVERWEIGHT");
        }
        else{
            System.out.println("You are dealing with OBESITY");
        }
    }
}
