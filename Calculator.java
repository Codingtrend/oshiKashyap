import java.util.Scanner;
public class Calculator
{  
  

   public static void main(String[] args)
   {
   int a,b;
   char ch;
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first number");
  a=sc.nextInt();
  System.out.println("Enter the second number");
  b=sc.nextInt();
  System.out.println("Enter the operation (+, -, *, /, %):");
  ch = sc.next().charAt(0);
   switch(ch)
{
   case '+': System.out.print("Addition::="+(a+b));
   break;
   case '-': System.out.print("Subtraction::="+(a-b));
   break;
   case '*': System.out.print("Multiplication::="+(a*b));
   break;
   case '/': System.out.print("Division::="+(a/b));
   break;
   case '%': System.out.print("Modulus::="+(a%b));
   break;
}

}
   
}
