import java.util.Scanner;
class FullPyramid
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter the size of pyramid:");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k =1;k<=i;k++)
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
	}
}