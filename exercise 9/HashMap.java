/*Program to Convert HashMap to TreeMap */

import java.util.*;

class HashMapDemo {
public static void main(String args[]) {
// Create a tree map.
HashMap<String, Double> hm = new HashMap<String, Double>();

// Put elements to the map.
hm.put("John Doe", 3434.34);
hm.put("Tom Smith", 123.22);
hm.put("Jane Baker", 1378.00);
hm.put("Tod Hall", 99.22);
hm.put("Ralph Smith", -19.08);

System.out.println("elements in hashmap: "+hm+"\n");


TreeMap<String,Double> tm =new TreeMap<>();
		tm.putAll(hm);
		System.out.println("elements in Treemap: "+tm+"\n");	


}
}


/*
OUTPUT

elements in hashmap: {Tod Hall=99.22, John Doe=3434.34, Ralph Smith=-19.08, Tom Smith=123.22, Jane Baker=1378.0}

elements in Treemap: {Jane Baker=1378.0, John Doe=3434.34, Ralph Smith=-19.08, Tod Hall=99.22, Tom Smith=123.22}

*/
