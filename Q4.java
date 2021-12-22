import java.util.*;

public class Q4 {

	public static void main(String[]args) {
		int [][] array2=new int[3][3];
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Please enter the element: ");
				array2[i][j]=scanner.nextInt();
				
				
			}
		}
		
		int nmax=array2[0][0];
		int[] index=new int[2];
		System.out.println("Your 2D Array is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array2[i][j]);
				
				if(nmax<array2[i][j]) {
					nmax=array2[i][j];
					index[0]=i;
					index[1]=j;
				}
				
			}
			
			System.out.println(" ");
		}
		System.out.println("the maximum number in the array is: "+nmax);
		System.out.println("index of the maximum number is: "+"["+index[0]+"]"+"["+index[1]+"]");
		
		scanner.close();
		
		
	}
}
