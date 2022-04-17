/*
expt1-define a class product and with data members pcode,pname and price.
Create 3 objects of the class and find the product having the lowest price.
*/

import java.util.*;

class product{   //creating  class product
       int pcode;   //decalring the variables
       double price;
       String pname;
       void disp(){  //method to dispaly details
      
       System.out.println("product code:"+pcode+"\nproduct name:"+pname+"\nproduct price:"+price);
       }
}

 class details{  //main class
      public static void main(String args[]){  
            Scanner ob=new Scanner(System.in);
		product p1=new product();          //create 3 objects of Product class
		product p2=new product();
		product p3=new product();
		
		System.out.println("Enter the details of product 1");	//details of product 1
		System.out.print("\nproduct code:");
		p1.pcode=ob.nextInt();
		System.out.print("product Name:");
		p1.pname=ob.next();
		System.out.print("product Price:");
		p1.price=ob.nextDouble();
		System.out.println("-----------------------");
		
		
		System.out.println("Enter the details of product 2");	//details of product 2
		System.out.print("\nproduct code:");
		p2.pcode=ob.nextInt();
		System.out.print("product Name:");
		p2.pname=ob.next();
		System.out.print("product Price:");
		p2.price=ob.nextDouble();
		System.out.println("-----------------------");
		
		
		System.out.println("Enter the details of product 3");	//details of product 1
		System.out.print("\nproduct code:");
		p3.pcode=ob.nextInt();
		System.out.print("product Name:");
		p3.pname=ob.next();
		System.out.print("product Price:");
		p3.price=ob.nextDouble();
		System.out.println("-----------------------\n");
           
                if(p1.price<p2.price)
		{
		if(p1.price<p3.price)  //loop to check for minimum priced product
                {  
                 System.out.println("the product"+p1.pname+"have minimum price\n----------");
                 p1.disp();
                 
                }
                else
                {
                System.out.println("the product"+p3.pname+"have minimum price\n----------");
                p3.disp();
                }
                }
           
                else
		{ 
	        if(p2.price<p3.price)
                {
		System.out.println("The  product"+p2.pname+" is minimum price\n-------------------");
		p2.disp();
		}
		else
                {
		System.out.println("The  product"+p3.pname+" is minimum price\n---------------------");
		p3.disp();
		}	
		}
       
         }
}

/*
OUTPUT
A)
Enter the details of product 1

product code:1
product Name:boost
product Price:120
-----------------------
Enter the details of product 2

product code:2
product Name:horlicks
product Price:130
-----------------------
Enter the details of product 3

product code:3
product Name:bonvita
product Price:140
-----------------------

the product boosthave minimum price

B)

product code:1
product Name:boost
product Price:200
-----------------------
Enter the details of product 2

product code:2
product Name:horlicks
product Price:150
-----------------------
Enter the details of product 3

product code:3
product Name:bonvita
product Price:50
-----------------------

The  product bonvita is minimum price
---------------------
product code:3
product name:bonvita
product price:50.0

C)
product code:1
product Name:boost
product Price:100
-----------------------
Enter the details of product 2

product code:2
product Name:horlicks
product Price:50
-----------------------
Enter the details of product 3

product code:3
product Name:bonvita
product Price:200
-----------------------

The  product horlicks is minimum price
-------------------
product code:2
product name:horlicks
product price:50.0

/*