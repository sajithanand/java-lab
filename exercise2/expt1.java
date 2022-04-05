import java.util.*;

class Matrix  {
	public static void main(String args[]) {
                Scanner obj = new Scanner(System.in);
		System.out.println("enter the rows columns:");
		System.out.print("rows :");
		int rows=obj.nextInt();
		System.out.print("columns :");
		int cols=obj.nextInt();
		int array1[][]= new int[rows][cols];
		int array2[][]= new int[rows][cols];
		int result[][]= new int[rows][cols];
                   
                System.out.println("enter the no of elements in first matrix:"); //adding elements to 1st array
                for(int i=0;i<rows;i++)
                {
                 for(int j=0;j<cols;j++) 
	        {
	         array1[i][j]=obj.nextInt();
				
		}
		}
                System.out.println("enter the of elements in second matrix:");
                for(int i=0; i<rows; i++)
                {
                for(int j=0;j<cols;j++)
                {
                 array2[i][j]=obj.nextInt();
                }
                }
                System.out.println("result matrix is given below:");
                for(int i=0;i<rows;i++)
                {
                 for(int j=0;j<cols;j++)
                {
                 result[i][j]=array1[i][j]+array2[i][j];
                System.out.print("\t"+result[i][j]);
                 }
                 System.out.print("\n");
	         }
          
        }
}



/*
OUTPUT

enter the rows columns:
rows :3
columns :3
enter the no of elements in first matrix:
1 2 3
2 3 4
5 6 7
enter the of elements in second matrix:
3
2 5 
1 2 4
4 5 7
the result matrix is given below:
	4	4	8
	3	5	8
	9	11	14
*/

                
                  
                 
