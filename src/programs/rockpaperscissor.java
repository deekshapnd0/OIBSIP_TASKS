package programs;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        // int rock=0;
        // int paper=1;
        // int scissor=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 0 for rock, enter 1 for paper, enter2 for scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if (computerinput == userinput) {
            System.out.println("GAME DRAW");
        }
        else if (computerinput == 0 && userinput == 1 || computerinput == 1 && userinput == 2 || computerinput == 2 && userinput == 0) {
            System.out.println("!! USER WINS !!");
        }
        else {
            System.out.println("!! COMPUTER WINS !!");
        }
        System.out.println("computer choice is" +computerinput);
        if(computerinput==0){
             System.out.println("computer choice is rock");
        }
        else if (computerinput==1) {
            System.out.println("computer choice is paper");
        }
        else{
            System.out.println("computer choice is scissor");
        }
    }
}
