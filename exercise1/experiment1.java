import java.util.Scanner;
class floating {
           public static void main(String args[]) {
           Scanner in = new Scanner(System.in);
           System.out.println("enter a number: ");
           double m = in.nextDouble();
           if(m>0)
          {
            System.out.println("the number is positive");
            if(m<1)
            {
            System.out.println("number is small positive.....");
            }
            else if(m>100000)
            {
             System.out.println("number is large positive......");
             }
            }
           else if(m<0)
            {
             System.out.println("the number is negative");
            
             if(Math.abs(m)<1)
             {
              System.out.println("the number is negative small...... ");
              }
               else if(Math.abs(m)>100000)
               {
                System.out.println("number is negative large.....");
               }
             }
            else
                {
                 System.out.println("number is zero.....");
                }
         }
}









/*
OUTPUT

1)
enter a number: 
5
the number is positive

enter a number: 
0.05
the number is positive
number is small positive.....

*/



           
