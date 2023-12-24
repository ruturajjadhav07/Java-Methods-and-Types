// Write a code for password checking and it should have validations.
import java.util.Scanner;

public class passwordCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int remaindTrys = 3;

        while (true) {
            System.out.print("Enter Password : ");
            String Pass1 = sc.next();
            int length =    Pass1.length();
            System.out.print("Enter Password again : ");
            String Pass2 = sc.next();


            if (Pass1.equals(Pass2)) {
                if (Pass1.length() > 5 && Pass1.matches("[A-Za-z0-9 ]*")){
                    System.out.println("Password meets criteria...");
                }else {
                    System.out.println("password length must be greater than 5 or it should contains Uppercase and Smallcase etc.");
                }
                System.out.println("Password matches successfully...!");
                System.out.println("Your Password word is of length " + length);
                break;
            } else {
                System.out.println("Password does not match to first password retype again");
                remaindTrys--;
                System.out.println("Remaining chances : "+remaindTrys);
                if (remaindTrys == 1){
                    System.out.println("Last chance to rewrite your password....");
                }
                if(remaindTrys == 0){
                    System.out.println("Max attempts reached try again.....");
                    break;
                }
            }

        }


    }

}






