import java.util.Scanner;
class compare{
                     public static void main(String args[]) {
                     Scanner n = new Scanner(System.in);
                    System.out.println("enter 3 numbers: ");
                    int num1 = n.nextInt();
                    int num2=n.nextInt();
                    int num3=n.nextInt();
                   
                     if(num1<num2  && num2<num3)
                     {
                      System.out.println("numbers are in increasing order.....");
                      }
                      else if(num1>num2 && num2>num3)
                      {
                      System.out.println("numbers are in decreasing order.....");
                      }
                     else
                     {
                      System.out.println("numbers are neither  increasing or decreasing order!!!!!!");
                      }
           }
}

/**
OUTPUT

1)
enter 3 numbers: 
3 4 5
numbers are in increasing order.....

2)
enter 3 numbers: 
6 5 4
numbers are in decreasing order.....

3)
enter 3 numbers: 
5 6 1
numbers are neither  increasing or decreasing order!!!!!!

**/

