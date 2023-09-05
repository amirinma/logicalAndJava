import java.util.Scanner;
public class logicalAndJava{
   public static void main(String[] arg){
      double salary, yearsOnJob;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your base salary :");
      salary = keyboard.nextDouble();
      System.out.println("Enter years on job :");
      yearsOnJob = keyboard.nextDouble();
      
      if (salary >= 100000 || yearsOnJob >= 3)
         System.out.println("You are qualified.");
      else 
         System.out.println("You are disqualified.");
   }
}