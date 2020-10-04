import java.util.Scanner;
class FullInvertedPattern7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of pyramid:");
		int n = sc.nextInt();
		int i,j,k,l;
		l=n;
		for(i=0;i<=n;i++,l-=1)
		{
			for(j=0;j<i;j++)
			{	
				System.out.print(" ");
			}
			
			for(k=n-1;k>=i;k--)
			{
				System.out.print(" "+l);
				
			}
			
			System.out.println();
		}
	}
}