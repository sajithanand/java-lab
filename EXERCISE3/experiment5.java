//FIND THE AREA OF DIFFERENT SHAPES USING OVERLOADED FUNCTIONS

import java.util.*;
class OverLoadArea{

		void area(int a){                                         //methord for area of squre
			System.out.println("Area of Squre:"+a*a);	
		}
		void area(int a,int b){	                                  //methord for area of Rectangle
			System.out.println("Area of Rectangle:"+a*b);	
		}
		void area(double r){	                                  //methord for area of Circle
			System.out.println("Area of Circle:"+3.14*r*r);	
		}
	}
			
class Overloading{
	public static void main(String ar[]){	
	
			Scanner sc=new Scanner(System.in);                 //scanner object
			OverLoadArea o=new OverLoadArea();	           //object of class OverLoadArea
			
			System.out.println("1.Squre\n2.Rectangle\n3.Circle");
			System.out.print("Enter your option:");
			int opt = sc.nextInt();
			System.out.println("---------------------");
			switch(opt){
				case 1:System.out.println("Squre");
					   System.out.print("Enter the side of squre:");
					   int side = sc.nextInt();
					   o.area(side);
					   break;
				case 2:System.out.println("Rectangle");
					   System.out.print("Enter Length:");
					   int len = sc.nextInt();
					   System.out.print("Enter breadth:");
					   int brd = sc.nextInt();
					   o.area(len,brd);
					   break;
				case 3:System.out.println("Circle");
					   System.out.print("Enter Radius:");
					   double r = sc.nextDouble();
					   o.area(r);
					   break;
					   
			
			
			
			}
			
			
	}


}

/*


OUTPUT
--------------------
1.Square
2.Rectangle
3.Circle
Enter your option:1
---------------------
Squre
Enter the side of square:3
Area of Squre:9

---------------------
1.Square
2.Rectangle
3.Circle
Enter your option:2
---------------------
Rectangle
Enter Length:4
Enter breadth:5
Area of Rectangle:20

----------------------
1.Square
2.Rectangle
3.Circle
Enter your option:3
---------------------
Circle
Enter Radius:6
Area of Circle:113.03999999999999

--------------------

*/

