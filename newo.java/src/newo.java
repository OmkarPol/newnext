import java.util.Scanner;
public class newo {
	public static void main(String args[]) {
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int n = sc.nextInt();
	
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<n ; i++)
			arr[i] = sc.nextInt();
		for(int i =0 ; i<n ; i++)
		{
			for(int j = i+1 ; j<n ; j++)
				if (arr[i] > arr[j])
				{
					t = arr[i];
					arr[i] =  arr[j];
					arr[j]= t;
				}
					System.out.print("Array Elements in Ascending Order: ");
			        for (int i1 = 0; i1 < n - 1; i1++) 
			        	 System.out.println(arr[i1] + ", ");
        
        System.out.println(arr[n- 1]);
		}
				}
}
