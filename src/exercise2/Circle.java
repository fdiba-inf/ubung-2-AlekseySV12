package exercise2;
import java.util.Scanner;
import java.lang.Math;
public class Circle{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int r=input.nextInt();
    System.out.println("Circumference: " + 2.0*(Math.PI)*r);
    System.out.println("Area: " + (Math.PI)*r*r);
  }
}