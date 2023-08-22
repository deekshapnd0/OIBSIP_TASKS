package  programs ;
import java.util.Random;
import java.util.Scanner;

// random password generator program:
public class PasswordGenerator {
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialCharacters="<>/?|:;'-_!@#$%^&*(){}[]";
        String combine= upper + lower + num + specialCharacters;
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        char[] password=new char[len];
        Random r=new Random();
        for(int i=0; i<len; i++)
        {
            password[i]=combine.charAt(r.nextInt(combine.length()));
        }
          System.out.println("generated password is:"+new String(password));
    }
}
