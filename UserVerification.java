import java.util.Scanner;

public class UserVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a number:");
            num=sc.nextInt();
        }while(num>0);

    }
}
