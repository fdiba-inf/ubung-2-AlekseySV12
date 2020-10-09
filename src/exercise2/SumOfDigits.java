package exercise2;
import java.util.Scanner;
public class SumOfDigits{
  public static void main(String[] args){
    System.out.println("eine Zahl zwischen 0 und 999 in der Konsole eingeben");
    Scanner input=new Scanner(System.in);
    int zahl=input.nextInt();
    int d1=zahl%10;
    zahl=zahl/10;
    int d2=zahl%10;
    zahl=zahl/10;
    int d3=zahl%10;
    System.out.println("Sum of digits: " + (d1+d2+d3));

  }
}