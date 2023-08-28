package ATM_MACHINE;

import java.sql.SQLOutput;
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;
    public void checkpin(){
        System.out.println("Enter your PIN Number");
        Scanner sc = new Scanner(System.in);
        int pinentered = sc.nextInt();
        if(pinentered==PIN){
            menu();
        }
        else{
            System.out.println("PIN entered is invalid");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1){
            CheckBalance();
        }
        else if(option==2) {
            WithdrawMoney();
        }
        else if(option==3){
            DepositMONEY();
        }
        else if(option==4){
            return;
        }
        else{
            System.out.println("Enter a Valid Choice");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter Amount to be Withdrawn from your Account");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("SORRY! Insufficient Balance");
            }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();
    }
    public void DepositMONEY(){
        System.out.println("Enter the Amount you want to Deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Amount deposited Successfully! Now your CURRENT BALANCE is :"+Balance);
        menu();
    }
}
public class ATMMACHINE {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}
