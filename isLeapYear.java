import java.time.Year;
import java.util.Scanner;

public class isLeapYear {
    public static boolean checkYear(int year) {
        Year y = Year.of(year);
        return y.isLeap();
    }
 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Type a year, which I need to check");
         int year = scan.nextInt();
        if (checkYear(year)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

