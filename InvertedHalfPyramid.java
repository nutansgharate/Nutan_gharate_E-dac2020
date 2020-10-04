import java.util.Scanner;
class InvertedHalfPyramid
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of pyramid:");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}