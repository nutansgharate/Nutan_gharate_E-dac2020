import java.util.Scanner;
class Half_Pyramid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter the size of pyramid:");
		int i,j;
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}