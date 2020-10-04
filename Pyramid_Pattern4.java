import java.util.Scanner;
class Pyramid_Pattern4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Pyramid's size:");
		int n = sc.nextInt();
		int i,j,k,m;
		for (i=1;i<=n;i++)
		{

			for(j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(m=i-1;m>=1;m--)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
	}
}