import java.util.Scanner;
class HollowInvertedPyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of pyramid");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				if(i==1 || j==n ||j==i)
				{
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}