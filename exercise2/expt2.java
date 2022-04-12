import java.util.*;
	
	
	 class exp2 {
		
		public static void main(String args []) {			//main function
			Scanner obj = new Scanner(System.in);
			System.out.println("enter the rows columns:");
			System.out.print("rows :");
			int rows=obj.nextInt();
			System.out.print("columns :");
			int cols=obj.nextInt();
			
			int array1[][]= new int[rows][cols];// array initialization
			int array2[][]= new int[rows][cols];
			
			System.out.println("Enter the elements in the matrix:"); // insert elements
			for (int i=0;i<rows;i++) 
			{
				for(int j=0;j<cols;j++) 
				{
					array1[i][j]=obj.nextInt();
					
				}
				
			}
			for (int i=0;i<rows;i++) //creating transpose of the matrix
			{
				for(int j=0;j<cols;j++) 
				{
					array2[i][j]=array1[j][i];
					
				}
				
			}
			int same =0;
			for (int i=0;i<rows;i++) 
			{
				for(int j=0;j<cols;j++) 
				{
					if(array1[i][j]==array2[i][j])
					{
						same = 1;							
					}
					else{
							same =0;
							break;					
						}
										
				}
				}
			if(same==1){
				System.out.println("It is a symmetric matrix");
	
			}
			else if(same==0){
					System.out.println("It is not a symmetric matrix");
				}
			
				
			
			
	}
	}

/*
1)
enter the rows columns:
rows :3
columns :3
Enter the elements in the matrix:
1 1 -1
1 2 0
-1 0 5
It is a symmetric matrix

2)
enter the rows columns:
rows :3
columns :3
Enter the elements in the matrix:
1 2 3
4 5 6
7 8 9
It is not a symmetric matrix
**/
