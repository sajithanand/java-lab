/* Create an Arithmetic package that has classes and interfaces
for the 4 basic arithmetic operations. Test the package by
implementing all operations on two given numbers  (DATE-13-05-2022) */


import java.util.*;
import Arithematic.*;

class AP{
                         public static void main(String args[]){
                         Scanner ob=new Scanner(System.in);
                         System.out.println("Enter two numbers:");
                         int a=ob.nextInt();
                         int b=ob.nextInt();

                         Add add=new Add();
		         add.Result(a,b);

		         Sub sub=new Sub();
			 sub.Result(a,b);

			 Mult mul=new Mult();
			 mul.Result(a,b);

		         Div div=new Div();
			 div.Result(a,b);
        }
 }


/*
OUTPUT

Enter two numbers:
4
7
Added result
Result=11
----------------
Added result
Result=-3
----------------
Multiplied Result
Result=28
----------------
Division Result
Result=0.5714285714285714
----------------

*/

