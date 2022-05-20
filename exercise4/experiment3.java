//expt3-program to illustrate string manipulation methods


class StrManipulation{
              public static void main(String[] args){
              //new string using new
              char chs[]={'w','e','l','c','o','m','e'};
               String newStr=new String(chs);
              System.out.println("New string from char[] using new String:  "+newStr);
           
              byte asciis[]={65,66,67,68,69,70};
              newStr=new String(asciis);
              System.out.println("New string from byte[] using new String:  "+newStr);
             
               String s1="good";
               String  s2="MorNing";

              //string length
               System.out.println("String length of good: "+s1.length());
            
              //to uppercase and to lowercase
              System.out.println("-----------String case change-----------");
              System.out.println(s1+"to uppercase:"+s1.toUpperCase());
              System.out.println(s2+"to lowercase:"+s2.toLowerCase());
               
             //string concatenation
             System.out.println("-----------String concatenation-----------"); 
              System.out.println("Using concat():"+ s1.concat(s2));
             System.out.println("using + operator:"+s1 + s2);
     
             //character extraction
              System.out.println("-----------character extraction-----------");
              System.out.println("character at 3rd position:" + s1.charAt(3));
              char c[]=new char[5];
              s1.getChars(2,4,c,0);
              System.out.println("character between 2 and 4: "+ new String(c)); 

             System.out.println("-----------character comparison-----------");
             s1="welcome";
             s2="WELCOME";
              System.out.println(s1+"equals" +s2+ ":" + s1.equals(s2));
              System.out.println(s1+"compareTo "+s2 +":" + s1.compareTo(s2));
             System.out.println(s1+"compareToIgnorecase"+s2+ ":" + s1.compareToIgnoreCase(s2));
             
              System.out.println(s1+"startsWith w:" + s1.startsWith("w"));
              System.out.println(s1+"endsWith x:" + s1.endsWith("x"));
    
             System.out.println("------------character  searching---------");
             s1="good morning to  to all";
             System.out.println("indexOf(to) in "+s1+" is: "+ s1.indexOf("to"));
             System.out.println("lastIndexOf(to) in " + s1 + " is: " + s1.lastIndexOf("to"));       

               System.out.println("------------string modification---------");
               s2="welcome to java program";
               System.out.println("replaced string of " + s2 + " is: " + s2.replace("java","python"));
              
              System.out.println("------------data conversion using value of()---------");
              s2="master";
              int value=30;  
              String s3=s1.valueOf(value);  
              System.out.println(s2 +s3);         
}
}

/**
OUTPUT

New string from char[] using new String:  welcome
New string from byte[] using new String:  ABCDEF
String length of good: 4
-----------String case change-----------
goodto uppercase:GOOD
MorNingto lowercase:morning
-----------String concatenation-----------
Using concat():goodMorNing
using + operator:goodMorNing
-----------character extraction-----------
character at 3rd position:d
character between 2 and 4: od
-----------character comparison-----------
welcomeequalsWELCOME:false
welcomecompareTo WELCOME:32
welcomecompareToIgnorecaseWELCOME:0
welcomestartsWith w:true
welcomeendsWith x:false
------------character  searching---------
indexOf(to) in good morning to  to all is: 13
lastIndexOf(to) in good morning to  to all is: 17
------------string modification---------
replaced string of welcome to java program is: welcome to python program
------------data conversion using value of()---------
master 30

*/
