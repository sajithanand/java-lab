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
