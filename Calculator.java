import java.util.*;
import java.lang.Math;

class Calculator {
  public static void main(String a[]) {

    int num1 = 0, num2 = 0, option, ex;
    
    
    do {
      Scanner sc = new Scanner(System.in);
      {
        System.out.println("HELLO!! iam calculator made by OM how will you like to play with numbers please choose:");
      }
      System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.square of number 6.square root 7.Percentage 8.Exit");
      option = sc.nextInt();
      if (option<=1 || option<=2 || option<=3 || option<=4) {
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
      }
      else if(option==5){

        System.out.println("enter the number");
      }
      else if(option==6){
        System.out.println("enter the number");
      } 
      else if(option==7){
        System.out.println("Enter your marks ::");
         System.out.println("Enter total marks ::");
        
      }   
      else
        break;
      switch (option) {
        case 1:
          System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
          break;
        case 2:
          System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
          break;
        case 3:
          System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
          break;
        case 4:
          if (num2 == 0)
            System.out.println("Error!!! In Division denominator cannot be 0!");
          else {
            System.out.println("In division of " + num1 + " by " + num2 + " quotient is " + (num1 / num2)
                + " and remainder is " + (num1 % num2));
          }
          break;
        case 5:
        int n;
        n = sc.nextInt();
         System.out.println("square of " + n + " is " +(n*n));
          
          break;
        case 6:
        int m;  
        m = sc.nextInt();
         System.out.println(Math.sqrt(m));
        case 7:
        float percentage;
        float total_marks;
        float scored;
        scored = sc.nextFloat();
        total_marks = sc.nextFloat();
  
        percentage = (float)((scored / total_marks) * 100);
        System.out.println("Percentage ::"+ percentage); 
        case 8:
          break;
        default:
          System.out.println("Invalid choice");
      }
      System.out.println("Do you want to continue?1.Yes 2.No");
      ex = sc.nextInt();
    } while (ex == 1);
    
  }

}