import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userValue;
        System.out.println("Enter a number:");
        userValue = scan.nextInt();
        if (userValue%2 == 0) {
            System.out.println("The number is even!");
        }else{
            System.out.println("The number is odd!");
        }
    }
}