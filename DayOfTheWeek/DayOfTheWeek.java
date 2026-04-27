import java.util.Scanner;

public class Main {
  public static void main(String[] args){
  Scanner dayOfWeek = new Scanner(System.in); 
  System.out.print("Enter Month(digit): ");
  int month = dayOfWeek.nextInt();
  System.out.print("Enter a Year(4 digits): ");
  int year = dayOfWeek.nextInt();
    System.out.print("Enter a day (1 - 30): ");
  int day = dayOfWeek.nextInt();
    String result = dayOfWeek(month, day, year);
    System.out.println("Day of the week: " + result);
  }
 
  
  public static String dayOfWeek(int month, int day, int year)
  {
    int y = year - (14 - month)/12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month)/12) -2;
    int D = (day + x + 31 * m /12) % 7;

    if (D == 0) {
    return "Sunday";}
    if (D == 1) {
      return "Monday";
    }
    if (D == 2){
      return "Tuesday";
    }
    if (D == 3){
      return "Wednesday";
    }
    if (D == 4){
      return "Thursday";
    }
    if (D == 5){
      return "Friday";
    }
    if (D == 6){
      return " Sataruday";
    }
    else{
      return "You did sum wrong bud";
    }
  }

}
