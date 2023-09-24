import java.util.Scanner;

public class newI
{
  static int isLeapYear(int y)
  {
    if((y % 400 == 0) ||
       (y % 100 != 0) &&
       (y % 4 == 0))
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
 
  public static void main(String[] args)
  {int answear;

    Scanner scan = new Scanner(System.in);
    System.out.println("Type a year, which I need to check");
    answear = scan.nextInt();
    System.out.println(isLeapYear(answear));
  }
}