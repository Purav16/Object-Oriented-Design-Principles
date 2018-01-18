import java.util.Scanner;

class Sub_Class {
   int z;
	
   public int addition(int x, int y) {
      z = x + y;
      //System.out.println("The sum of the given numbers:"+z);
      return z;
   }
	
   public int Subtraction(int x, int y) {
      z = x - y;
      //System.out.println("The difference between the given numbers:"+z);
      return z;
   }
}

public class Open_Close_Principle extends Sub_Class {
   public int multiplication(int x, int y) {
      z = x * y;
      //System.out.println("The product of the given numbers:"+z);
      return z;
   }
	
   public static void main(String args[]) {
      //int a = 20, b = 10;
      System.out.println("Enter two variables a & b");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
	   Open_Close_Principle demo = new Open_Close_Principle();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}