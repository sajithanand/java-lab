/* Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects. (DATE - 06/05/2022) */
 
import java.util.*;
interface Fn{
                 void input();
                 void area();
                 void perimeter();
               }
 
class Circle implements Fn{
                     Scanner ob=new Scanner(System.in);
                     int r=0;
                     double pi=3.14;
                     double area=0;
                     double perimeter=0;

                     public void input(){
                                System.out.println("Enter radius:");
                                this.r=ob.nextInt();
                    }

                     public void area(){
                                   area=pi*r*r;
                                     System.out.println("Area="+area);  
                     }

                     public void perimeter(){
                                 perimeter=2*pi*r;
                                 System.out.println("perimeter="+perimeter);               
                     }
      }

class Rectangle implements Fn{
                     Scanner ob=new Scanner(System.in);
                     int l=0;
                     int b=0;
                     double area=0;
                     double perimeter=0;

                     public void input(){
                                System.out.println("Enter length and breadth:");
                                this.l=ob.nextInt();
                                this.b=ob.nextInt();
                    }

                     public void area(){
                                   area=l*b;
                                   System.out.println("Area="+area);  
                     }

                     public void perimeter(){
                                 perimeter=2*(l+b);
                                 System.out.println("perimeter="+perimeter);               
                     }
      }

class Main{
                   public static void main(String args[]){
                   Scanner ob=new Scanner(System.in);
                   Circle c=new Circle();
                   Rectangle r=new Rectangle();
                 
                   while(true){
                             System.out.println("1.CIRCLE\n2.RECTANGLE\n3.EXIT");
                             System.out.print("Enter your option:");
                             int op=ob.nextInt();
                             switch(op){
                                         
                                           case 1:System.out.println("\nCircle");
                                                       c.input();
                                                       c.area();
                                                       c.perimeter();
                                                       System.out.println("-------------------------------------------------------------------------------");
                                                       break;
                                         
                                           case 2:System.out.println("\nRectangle");
                                                       r.input();
                                                       r.area();
                                                       r.perimeter();
                                                       System.out.println("-------------------------------------------------------------------------------");
                                                       break;
                   
                                         default:System.out.println("Exiting...............");
           
                                                       System.exit(0);
                                                       break;
                                         }
                                }
           }
}


/*
OUTPUT

1.CIRCLE
2.RECTANGLE
3.EXIT
Enter your option:1

Circle
Enter radius:
5
Area=78.5
perimeter=31.400000000000002
-------------------------------------------------------------------------------
1.CIRCLE
2.RECTANGLE
3.EXIT
Enter your option:2

Rectangle
Enter length and breadth:
6
7
Area=42.0
perimeter=26.0
-------------------------------------------------------------------------------
1.CIRCLE
2.RECTANGLE
3.EXIT
Enter your option:3
Exiting...............

*/












              
