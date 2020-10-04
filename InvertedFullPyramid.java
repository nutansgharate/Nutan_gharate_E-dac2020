import java.util.Scanner;
class InvertedFullPyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the sie of pyramid:");
		int n = sc.nextInt();
		int i,j,k,l;
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(k=n;k>i;k--)
			{
				System.out.print(" *  ");
			}
			System.out.println();
		}
	}
}