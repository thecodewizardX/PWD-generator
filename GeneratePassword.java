import java.util.Random;
import java.util.Scanner;

public class GeneratePassword{
    
    public static void main(String[] args){
       System.out.println("------------------- Create your Strong password -------------------\n");
       createPassword();
       System.out.println("\n------------------- Thank you! -------------------");
    }
    private static String generatePassword(int len){          //Generate random password
        Random random = new Random();
        String password="";
        String alphapets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChar = "!@#$%^&*()?.,|/";
        String numbers = "1234567890";
        String pwdSequnce = alphapets+alphapets.toLowerCase()+specialChar+numbers;
        for(int i=0;i<len;i++){
            password+=pwdSequnce.charAt(random.nextInt(pwdSequnce.length()));
        }
        return password;
    }
    public static void createPassword(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        System.out.print("\nEnter your password length (Suggested greater than 8 ) : ");
        int len = scan.nextInt();
        while(flag){
            System.out.println("\nGenerated password : "+ generatePassword(len));
            System.out.print("\n1)This password is Ok (or) 2)Generate another password (option : [ 1 or 2 ]) : ");
            int option = scan.nextInt();
            if(option != 2){
                break;
            }
        }
        scan.close();
    }
}
    