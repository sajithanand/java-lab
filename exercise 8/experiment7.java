/*Write a Java program to compare two hash set    DATE--01/05/2022  */

import java.util.*;

class setcomp{
	public static void main(String ar []){
	
	//create a empty hash set
	HashSet<String>hsA=new HashSet<String>();
	hsA.add("red");
	hsA.add("black");
	hsA.add("green");
	hsA.add("yellow");
	hsA.add("violet");

	System.out.println("\nelements in the hashset1: "+hsA);

	HashSet<String>hsB=new HashSet<String>();
	hsB.add("orange");
	hsB.add("blue");
	hsB.add("violet");
	hsB.add("red");
	hsB.add("green");

	System.out.println("\nelements in the hashset2: "+hsB);
	System.out.println("\ncomparing two hashsets hsA & hsB");
	System.out.println("--------------------------------");
	for(String element:hsA){
		
		if(hsB.contains(element)){
			System.out.println("\nhashsets hsA & hsB have element "+element);
			}
		else{
			System.out.println("\nelement "+element+" is only in one hashset");
			}
	}
}
}




/*
OUTPUT

elements in the hashset1: [red, green, black, yellow, violet]

elements in the hashset2: [orange, red, green, blue, violet]

comparing two hashsets hsA & hsB
--------------------------------

hashsets hsA & hsB have element red

hashsets hsA & hsB have element green

element black is only in one hashset

element yellow is only in one hashset

hashsets hsA & hsB have element violet

*/


