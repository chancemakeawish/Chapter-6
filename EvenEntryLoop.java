import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args){
        int userEntry =0;
        String result;
        Scanner input = new Scanner(System.in);

        while (userEntry != 999) {
            System.out.println("Welcome to my game.");
            System.out.println("Its called even loop.");
            System.out.println("Enter a whole even>>>");
            userEntry = input.nextInt();

            if (userEntry%2 == 0) {
                result = userEntry + "Good job!";
            }
            else
                result = userEntry + "Error!! number is not even";
            System.out.println(result);
        }
    }
}
