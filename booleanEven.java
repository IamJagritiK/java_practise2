import java.util.Scanner;

public class booleanEven {

   public static void main(String args[])
   {
      int number;
      System.out.println("Enter an integer to check if it is odd or even: ");
      Scanner input = new Scanner(System.in);
      number = input.nextInt();
      

      boolean answer =isEven(number);
      if (answer==true)
      {
          System.out.println("EVEN");
      }

      if (answer==false)
      {
          System.out.println("ODD");
      }



   }
   public static boolean isEven(int number)
   { 
    if(number % 2 == 0)
   {
        return true;
    }
    else 
    return false;

}
}