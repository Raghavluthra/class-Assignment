import java.util.*;
public class code1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		n=n-k+1;
		int count=(n*(n+1))/2;
		System.out.println(count);

	}
}