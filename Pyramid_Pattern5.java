import java.util.Scanner;

class Pyramid_Pattern5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Pyramid's size:");
		int n = sc.nextInt();
		int i,j,k,m;
		
		for (i=n;i>=1;i--)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			for(k=i;k<=n;k++)
			{
				
				System.out.print(k+" ");
				j++;	
			}
			for(m=n-1;m>=i;m--)
			{
				System.out.print(m+" ");
				
			}
			System.out.println();
		}
		
	}
}