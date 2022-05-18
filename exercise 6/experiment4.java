/*4. Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.   (DATE-06/05/2022) */


import Graphics.*;

class Test{
              public static void main(String args[]){
                  Rectangle r=new Rectangle();
                  r.area(5,9);
                  Circle c=new Circle();
                  c.area(4);
                  Triangle t=new Triangle();
                  t.area(5,8);
                  Square s=new Square();
                  s.area(9);
         }
   }


/*
OUTPUT

Area of rectangle having

length= 5
breadth= 9

Area=45
_________________________
Area of circle having 

radius=4.0
Area=50.24
_________________________
Area of triangle having

base=5
height=8

Area=20.0
_________________________
Area of square having

side=9
Area=81

*/
