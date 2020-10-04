import java.util.Scanner;
class HollowFullPyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of pyramid:");
		int n =sc.nextInt();
		int i,j,k,l;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				if(k==1 || i==n)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(l=1;l<n-1;l++)
			{	
				if(l==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
}