import java.util.Scanner;
class Pyramid_Pattern1
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
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}