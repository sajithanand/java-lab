/* Program to demonstrate the working of Map interface by adding, changing and removing elements.  DATE-08/06/2022 */

import java.util.*;
class HashMap1 {

public static void main(String args[])
{

                        HashMap<String, Double> hm = new HashMap<String, Double>();



// Inserting the Elements
      hm.put("SMITH", 3434.34);
      hm.put("Tom Smith", 123.22);
      hm.put("Jane Baker", 1378.00);
      hm.put("Tod Hall", 99.22);
      hm.put("Ralph Smith", -19.08);

// Initial Map
      System.out.println("Elements in hashmap:"+hm);

hm.remove("Jane Baker");

// Final Map
System.out.println("hashmap after removing Jane Baker:"+hm);


double h= hm.get("Tod Hall");
		hm.put("Tod Hall",h+75.5);
		System.out.println("value of box is changed : "+hm+"\n");
		
		
		Set<Map.Entry<String,Double>>set= hm.entrySet();
		for(Map.Entry<String,Double>i : set){
			System .out.println(i.getKey()+" : "+i.getValue());

}

}

}


/*
OUPUT

Elements in hashmap:{Tod Hall=99.22, SMITH=3434.34, Ralph Smith=-19.08, Tom Smith=123.22, Jane Baker=1378.0}

hashmap after removing Jane Baker:{Tod Hall=99.22, SMITH=3434.34, Ralph Smith=-19.08, Tom Smith=123.22}

value of box is changed : {Tod Hall=174.72, SMITH=3434.34, Ralph Smith=-19.08, Tom Smith=123.22}

Tod Hall : 174.72
SMITH : 3434.34
Ralph Smith : -19.08
Tom Smith : 123.22

*/

