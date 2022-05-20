/*Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings.    (date-19/05/2022) */






import java.util.*;
class StrSort{                                                        //define class StrSort
	 void SortAndDisp(String arr[]){                   //methord for sort and display array
		String temp;
		int len =arr.length;
			for(int i=0;i<len-1;i++){
				for(int j=i+1;j<len;j++){
						if(arr[i].compareTo(arr[j])>0)	                //compare all elements in the array each other
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
						
				}
			
			}
			for(int i=0;i<len;i++){           //loop for display sorted array
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			
		
	
	}
	String[] insert(String arr[],int len){  //method for read elements to array
		
		for(int i=0;i<len;i++){
		
			arr[i]=System.console().readLine();
		}
		return arr;
	
	}
	

	public static void main(String ar[]){                  //main methord
	
		StrSort st =new StrSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings you want: ");
		int num = sc.nextInt();
		String str[] = new String[num];		//initialize array
		System.out.println("Enter the elements in the array: ");
		str=st.insert(str,num);
		
		while(true){
				
				System.out.println("\n----------------------------------");
				System.out.println("1.Array sort by userdefind method\n2.Array sort by inbuilt method\n3.Exit...!");
				System.out.println("Enter your option : ");
				int opt = sc.nextInt();
				
				System.out.println("----------------------------------");
				if(opt==1){
						
						System.out.println("Array sort by userdefind method");
						st.SortAndDisp(str);
				
					
				}
				else if(opt == 2){
					System.out.println("Array sort by inbuilt method");
					Arrays.sort(str);
					for(int i=0;i<num;i++){
						System.out.print(str[i]+"\t");
					}
					System.out.println();
				}
				else{
					System.out.println("Exited....!");
					System.exit(0);
				}
		
		}
		
		
	
	}


}







/*
OUTPUT

Enter number of strings you want: 
3
Enter the elements in the array: 
aswin
abin 
midhun

----------------------------------
1.Array sort by userdefind method
2.Array sort by inbuilt method
3.Exit...!
Enter your option : 
1
----------------------------------
Array sort by userdefind method
abin 	aswin	midhun	

----------------------------------
1.Array sort by userdefind method
2.Array sort by inbuilt method
3.Exit...!
Enter your option : 
2
----------------------------------
Array sort by inbuilt method
abin 	aswin	midhun	

----------------------------------
1.Array sort by userdefind method
2.Array sort by inbuilt method
3.Exit...!
Enter your option : 
3
----------------------------------
Exited....!

*/

