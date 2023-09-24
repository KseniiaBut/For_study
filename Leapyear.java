import java.util.Scanner;

public class Leapyear {
    public static boolean isLeapYear(int year) {
        Scanner scan = new Scanner(System.in);
     System.out.println("Type a year, which i need to check");
    int year = scan.nextInt;
    if((year % 400 == 0) ||
    (year % 100 != 0) &&
    (year % 4 == 0))
 {
   return true;
 }
 else
 {
   return false;
 }
}
public static void main(String[] args)
  {
    int answearear = 2020;
    System.out.println(ISLP(year));
  }
}
